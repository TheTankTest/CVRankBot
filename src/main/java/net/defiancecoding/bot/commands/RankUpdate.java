package net.defiancecoding.bot.commands;

import discord4j.common.util.Snowflake;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.interaction.ChatInputInteractionEvent;
import discord4j.core.object.command.ApplicationCommandInteractionOption;
import discord4j.core.object.command.ApplicationCommandInteractionOptionValue;
import discord4j.core.object.entity.channel.GuildMessageChannel;
import discord4j.core.spec.EmbedCreateSpec;
import discord4j.core.spec.MessageCreateSpec;
import discord4j.rest.util.Color;
import net.defiancecoding.bot.Main;
import net.defiancecoding.bot.util.highscores.HiscoreResultBuilder;
import net.defiancecoding.bot.util.ranks.RankCalculator;
import net.defiancecoding.bot.util.ranks.Ranks;
import reactor.core.publisher.Mono;

import java.time.Instant;
import java.util.Objects;

import static discord4j.core.object.audit.OptionKey.CHANNEL_ID;

public class RankUpdate implements SlashCommand{


    @Override
    public String getName(){
        return "rankupdate";
    }


    @Override
    public Mono<Void> handle(ChatInputInteractionEvent event) {

        String name = event.getOption("username")
                .flatMap(ApplicationCommandInteractionOption::getValue)
                .map(ApplicationCommandInteractionOptionValue::asString)
                .get();

        RankCalculator rankCalculator = new RankCalculator();

        double points = rankCalculator.getPoints(name);
        Ranks rank = Ranks.SAPPHIRE;

        if (0 < points && points < 2999) {
            rank = Ranks.SAPPHIRE;
        }
        else if (3000 < points && points < 4499){
            rank = Ranks.EMERALD;
        }
        else if (3500 < points && points < 5999){
            rank = Ranks.RUBY;
        }
        else if (6000 < points && points < 7999){
            rank = Ranks.DIAMOND;
        }
        else if (8000 < points && points < 9999){
            rank = Ranks.DRAGONSTONE;
        }
        else if (10000 < points && points < 12499){
            rank = Ranks.ONYX;
        }
        else if (12500 < points && points < 14999){
            rank = Ranks.ZENYTE;
        }
        else if (15000 <= points && (!(points < 15000))){
            rank = Ranks.INFERNAL;
        }

        return event.reply().withEphemeral(false).withContent(
                "**Looking up: **" + name + System.lineSeparator()
                        + "**Points: **" + points + System.lineSeparator()
                        + "**Rank: **" + rank.name());
    }

}
