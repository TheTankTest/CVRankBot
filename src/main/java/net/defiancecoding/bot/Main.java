package net.defiancecoding.bot;

import discord4j.core.DiscordClientBuilder;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.interaction.ChatInputInteractionEvent;
import discord4j.core.object.presence.ClientActivity;
import discord4j.core.object.presence.ClientPresence;
import discord4j.rest.RestClient;
import lombok.SneakyThrows;
import net.defiancecoding.bot.discord.GlobalCommandRegistrar;
import net.defiancecoding.bot.discord.listeners.SlashCommandListener;
import net.defiancecoding.bot.util.ranks.RankCalculator;
import net.defiancecoding.bot.util.ranks.Ranks;
import org.apache.commons.lang3.Range;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Main {


    private static String token = "OTgzMDU4NTg2NzM1Mzc0MzM2.GrnLRZ.kn3Ii96zLq_2T73brie6-ZxgzMtz67t4GRzfzU";
    private static GatewayDiscordClient client_var;

    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        //Creates the gateway client and connects to the gateway
        final GatewayDiscordClient client = DiscordClientBuilder.create(token).setToken(token).build()
                .login()
                .block();

        client_var = client;

        /* Call our code to handle creating/deleting/editing our global slash commands.
        We have to hard code our list of command files since iterating over a list of files in a resource directory
         is overly complicated for such a simple demo and requires handling for both IDE and .jar packaging.
         Using SpringBoot we can avoid all of this and use their resource pattern matcher to do this for us.
         */
        List<String> commands = List.of("rankupdate.json");
        try {
            new GlobalCommandRegistrar(client.getRestClient()).registerCommands(commands);
        } catch (Exception e) {
            System.out.println("Error trying to register global slash commands. " +  e);
        }

        //Register our slash command listener
        client.on(ChatInputInteractionEvent.class, SlashCommandListener::handle)
                .then(client.onDisconnect())
                .block(); // We use .block() as there is not another non-daemon thread and the jvm would close otherwise.
    }



    public static GatewayDiscordClient getClient(){
        return client_var;
    }
}
