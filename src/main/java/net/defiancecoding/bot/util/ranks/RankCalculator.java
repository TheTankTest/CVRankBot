package net.defiancecoding.bot.util.ranks;


import net.defiancecoding.bot.Main;
import net.defiancecoding.bot.util.bosses.Bosses;
import net.defiancecoding.bot.util.highscores.HiscoreResult;
import net.defiancecoding.bot.util.highscores.HiscoreResultBuilder;
import net.defiancecoding.bot.util.highscores.HiscoreSkill;
import net.defiancecoding.bot.util.highscores.Skill;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class RankCalculator {


    double sire_kc = 0;
    double sire_points = 0;
    double sire_multi = Bosses.abyssal_sire.getValue();

    double hydra_kc = 0;
    double hydra_points = 0;
    double hydra_multi = Bosses.alchemical_hydra.getValue();

    double barrows_kc = 0;
    double barrows_points = 0;
    double barrows_multi = Bosses.barrows_chests.getValue();

    double bryophyta_kc = 0;
    double bryophyta_points = 0;
    double bryophyta_multi = Bosses.bryophyta.getValue();

    double callisto_kc = 0;
    double callisto_points = 0;
    double callisto_multi = Bosses.callisto.getValue();

    double cerberus_kc = 0;
    double cerberus_points = 0;
    double cerberus_multi = Bosses.cerberus.getValue();

    double cox_kc = 0;
    double cox_points = 0;
    double cox_multi = Bosses.chambers_of_xeric.getValue();

    double cox_hm_kc = 0;
    double cox_hm_points = 0;
    double cox_hm_multi = Bosses.chambers_of_xeric_challenge_mode.getValue();

    double chaos_elly_kc = 0;
    double chaos_elly_points = 0;
    double chaos_elly_multi = Bosses.chaos_elemental.getValue();

    double chaos_fanatic_kc = 0;
    double chaos_fanatic_points = 0;
    double chaos_fanatic_multi = Bosses.chaos_fanatic.getValue();

    double sara_kc = 0;
    double sara_points = 0;
    double sara_multi = Bosses.commander_zilyana.getValue();

    double corp_kc = 0;
    double corp_points = 0;
    double corp_multi = Bosses.corporeal_beast.getValue();

    double crazy_arch_kc = 0;
    double crazy_arch_points = 0;
    double crazy_arch_multi = Bosses.crazy_archaeologist.getValue();

    double dag_prime_kc = 0;
    double dag_prime_points = 0;
    double dag_prime_multi = Bosses.dagannoth_prime.getValue();

    double dag_supreme_kc = 0;
    double dag_supreme_points = 0;
    double dag_supreme_multi = Bosses.dagannoth_supreme.getValue();

    double dag_rex_kc = 0;
    double dag_rex_points = 0;
    double dag_rex_multi = Bosses.dagannoth_rex.getValue();

    double deranged_arch_kc = 0;
    double deranged_arch_points = 0;
    double deranged_arch_multi = Bosses.deranged_archaeologist.getValue();

    double bandos_kc = 0;
    double bandos_points = 0;
    double bandos_multi = Bosses.general_graardor.getValue();

    double mole_kc = 0;
    double mole_points = 0;
    double mole_multi = Bosses.giant_mole.getValue();

    double grotesque_guardians_kc = 0;
    double grotesque_guardians_points = 0;
    double grotesque_guardians_multi = Bosses.grotesque_guardians.getValue();

    double hespori_kc = 0;
    double hespori_points = 0;
    double hespori_multi = Bosses.hespori.getValue();

    double kalphite_queen_kc = 0;
    double kalphite_queen_points = 0;
    double kalphite_queen_multi = Bosses.kalphite_queen.getValue();

    double kbd_kc = 0;
    double kbd_points = 0;
    double kbd_multi = Bosses.king_black_dragon.getValue();

    double kraken_kc = 0;
    double kraken_points = 0;
    double kraken_multi = Bosses.kraken.getValue();

    double arma_kc = 0;
    double arma_points = 0;
    double arma_multi = Bosses.kreearra.getValue();

    double zammy_kc = 0;
    double zammy_points = 0;
    double zammy_multi = Bosses.kril_tsutsaroth.getValue();

    double mimic_kc = 0;
    double mimic_points = 0;
    double mimic_multi = Bosses.mimic.getValue();

    double nex_kc = 0;
    double nex_points = 0;
    double nex_multi = Bosses.nex.getValue();

    double nightmare_kc = 0;
    double nightmare_points = 0;
    double nightmare_multi = Bosses.nightmare.getValue();

    double nightmare_phosanis_kc = 0;
    double nightmare_phosanis_points = 0;
    double nightmare_phosanis_multi = Bosses.phosanis_nightmare.getValue();

    double obor_kc = 0;
    double obor_points = 0;
    double obor_multi = Bosses.obor.getValue();

    double sarachnis_kc = 0;
    double sarachnis_points = 0;
    double sarachnis_multi = Bosses.sarachnis.getValue();

    double scorpia_kc = 0;
    double scorpia_points = 0;
    double scorpia_multi = Bosses.scorpia.getValue();

    double skotizo_kc = 0;
    double skotizo_points = 0;
    double skotizo_multi = Bosses.skotizo.getValue();

    double tempoross_kc = 0;
    double tempoross_points = 0;
    double tempoross_multi = Bosses.tempoross.getValue();

    double gauntlet_kc = 0;
    double gauntlet_points = 0;
    double gauntlet_multi = Bosses.the_gauntlet.getValue();

    double corrupted_gauntlet_kc = 0;
    double corrupted_gauntlet_points = 0;
    double corrupted_gauntlet_multi = Bosses.the_corrupted_gauntlet.getValue();

    double tob_kc = 0;
    double tob_points = 0;
    double tob_multi = Bosses.theatre_of_blood.getValue();

    double tob_hm_kc = 0;
    double tob_hm_points = 0;
    double tob_hm_multi = Bosses.theatre_of_blood_hard_mode.getValue();

    double thermy_kc = 0;
    double thermy_points = 0;
    double thermy_multi = Bosses.thermonuclear_smoke_devil.getValue();

    double zuk_kc = 0;
    double zuk_points = 0;
    double zuk_multi = Bosses.tzkal_zuk.getValue();

    double jad_kc = 0;
    double jad_points = 0;
    double jad_multi = Bosses.tztok_jad.getValue();

    double venenatis_kc = 0;
    double venenatis_points = 0;
    double venenatis_multi = Bosses.venenatis.getValue();

    double vetion_kc = 0;
    double vetion_points = 0;
    double vetion_multi = Bosses.vetion.getValue();

    double vorkath_kc = 0;
    double vorkath_points = 0;
    double vorkath_multi = Bosses.vorkath.getValue();

    double wintertodt_kc = 0;
    double wintertodt_points = 0;
    double wintertodt_multi = Bosses.wintertodt.getValue();

    double zalcano_kc = 0;
    double zalcano_points = 0;
    double zalcano_multi = Bosses.zalcano.getValue();

    double zulrah_kc = 0;
    double zulrah_points = 0;
    double zulrah_multi = Bosses.zulrah.getValue();




    private boolean isPositive(double var){
        return var > 0;
    }


    public double getPoints(String user) {
        try {
            URL url = new URL("https://secure.runescape.com/m=hiscore_oldschool/index_lite.ws?player=" + user);
            URLConnection con = url.openConnection();
            BufferedReader in;
            in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String jsonString = in.lines().collect(Collectors.joining("\n"));

            HiscoreResult result = parseResponse(user, jsonString);


            if (isPositive(result.getAbyssalSire().level())) {
                this.sire_kc = result.getAbyssalSire().level();
                this.sire_points = this.sire_kc * this.sire_multi;
                //System.out.println("SireKC : " + sire_kc);
                //System.out.println("SirePoints: " + sire_points);
                //System.out.println("SireMulti: " + sire_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
            }
            if (isPositive(result.getAlchemicalHydra().level())) {
                this.hydra_kc = result.getAlchemicalHydra().level();
                this.hydra_points = this.hydra_kc * this.hydra_multi;
                //System.out.println("hydra_kc : " + hydra_kc);
                //System.out.println("hydra_points: " + hydra_points);
                //System.out.println("hydra_multi: " + hydra_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

            }
            if (isPositive(result.getBarrowsChests().level())) {
                this.barrows_kc = result.getBarrowsChests().level();
                this.barrows_points = this.barrows_points * this.barrows_multi;
                //System.out.println("barrows_kc : " + barrows_kc);
                //System.out.println("barrows_points: " + barrows_points);
                //System.out.println("barrows_multi: " + barrows_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                //System.out.println(System.lineSeparator());
            }
            if (isPositive(result.getBryophyta().level())) {
                this.bryophyta_kc = result.getBryophyta().level();
                this.bryophyta_points = this.bryophyta_kc * this.bryophyta_multi;
                //System.out.println("bryophyta_kc : " + bryophyta_kc);
                //System.out.println("bryophyta_points: " + bryophyta_points);
                //System.out.println("bryophyta_multi: " + bryophyta_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

            }
            if (isPositive(result.getCallisto().level())) {
                this.callisto_kc = result.getCallisto().level();
                this.callisto_points = this.callisto_kc * this.callisto_multi;
                //System.out.println("callisto_kc : " + callisto_kc);
                //System.out.println("callisto_points: " + callisto_points);
                //System.out.println("callisto_multi: " + callisto_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
            }
            if (isPositive(result.getCerberus().level())) {
                this.cerberus_kc = result.getCerberus().level();
                this.cerberus_points = this.cerberus_kc * this.cerberus_multi;
                //System.out.println("cerberus_kc : " + cerberus_kc);
                //System.out.println("cerberus_points: " + cerberus_points);
                //System.out.println("cerberus_multi: " + cerberus_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getChambersOfXeric().level())) {
                this.cox_kc = result.getChambersOfXeric().level();
                this.cox_points = this.cox_kc * this.cox_multi;
                //System.out.println("cox_kc : " + cox_kc);
                //System.out.println("cox_points: " + cox_points);
                //System.out.println("cox_multi: " + cox_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getChambersOfXericChallengeMode().level())) {
                this.cox_hm_kc = result.getAbyssalSire().level();
                this.cox_hm_points = this.cox_hm_kc * this.cox_hm_multi;
                //System.out.println("cox_hm_kc : " + cox_hm_kc);
                //System.out.println("cox_hm_points: " + cox_hm_points);
                //System.out.println("cox_hm_multi: " + cox_hm_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getChaosElemental().level())) {
                this.chaos_elly_kc = result.getChaosElemental().level();
                this.chaos_elly_points = this.chaos_elly_kc * this.chaos_elly_multi;
                //System.out.println("chaos_elly_kc : " + chaos_elly_kc);
                //System.out.println("chaos_elly_points: " + chaos_elly_points);
                //System.out.println("chaos_elly_multi: " + chaos_elly_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getChaosFanatic().level())) {
                this.chaos_fanatic_kc = result.getChaosFanatic().level();
                this.chaos_fanatic_points = this.chaos_fanatic_kc * this.chaos_fanatic_multi;
                //System.out.println("chaos_fanatic_kc : " + chaos_fanatic_kc);
                //System.out.println("chaos_fanatic_points: " + chaos_fanatic_points);
                //System.out.println("chaos_fanatic_multi: " + chaos_fanatic_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getCommanderZilyana().level())) {
                this.sara_kc = result.getCommanderZilyana().level();
                this.sara_points = this.sara_kc * this.sara_multi;
                //System.out.println("sara_kc : " + sara_kc);
                //System.out.println("sara_points: " + sara_points);
                //System.out.println("sara_multi: " + sara_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getCorporealBeast().level())) {
                this.corp_kc = result.getCorporealBeast().level();
                this.corp_points = this.corp_kc * this.corp_multi;
                //System.out.println("corp_kc : " + corp_kc);
                //System.out.println("corp_points: " + corp_points);
                //System.out.println("corp_multi: " + corp_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getCrazyArchaeologist().level())) {
                this.crazy_arch_kc = result.getCrazyArchaeologist().level();
                this.crazy_arch_points = this.crazy_arch_kc * this.crazy_arch_multi;
                //System.out.println("crazy_arch_kc : " + crazy_arch_kc);
                //System.out.println("crazy_arch_points: " + crazy_arch_points);
                //System.out.println("crazy_arch_multi: " + crazy_arch_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getDagannothPrime().level())) {
                this.dag_prime_kc = result.getDagannothPrime().level();
                this.dag_prime_points = this.dag_prime_kc * this.dag_prime_multi;
                //System.out.println("dag_prime_kc : " + dag_prime_kc);
                //System.out.println("dag_prime_points: " + dag_prime_points);
                //System.out.println("dag_prime_multi: " + dag_prime_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getDagannothSupreme().level())) {
                this.dag_supreme_kc = result.getDagannothSupreme().level();
                this.dag_supreme_points = this.dag_supreme_kc * this.dag_supreme_multi;
                //System.out.println("dag_supreme_kc : " + dag_supreme_kc);
                //System.out.println("dag_supreme_points: " + dag_supreme_points);
                //System.out.println("dag_supreme_multi: " + dag_supreme_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getDagannothRex().level())) {
                this.dag_rex_kc = result.getDagannothRex().level();
                this.dag_rex_points = this.dag_rex_kc * this.dag_rex_multi;
                //System.out.println("dag_rex_kc : " + dag_rex_kc);
                //System.out.println("dag_rex_points: " + dag_rex_points);
                //System.out.println("dag_rex_multi: " + dag_rex_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getDerangedArchaeologist().level())) {
                this.deranged_arch_kc = result.getDerangedArchaeologist().level();
                this.deranged_arch_points = this.deranged_arch_kc * this.deranged_arch_multi;
                //System.out.println("deranged_arch_kc : " + deranged_arch_kc);
                //System.out.println("deranged_arch_points: " + deranged_arch_points);
                //System.out.println("deranged_arch_multi: " + deranged_arch_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getGeneralGraardor().level())) {
                this.bandos_kc = result.getGeneralGraardor().level();
                this.bandos_points = this.bandos_kc * this.bandos_multi;
                //System.out.println("bandos_kc : " + bandos_kc);
                //System.out.println("bandos_points: " + bandos_points);
                //System.out.println("bandos_multi: " + bandos_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getGiantMole().level())) {
                this.mole_kc = result.getGiantMole().level();
                this.mole_points = this.mole_kc * this.mole_multi;
                //System.out.println("mole_kc : " + mole_kc);
                //System.out.println("mole_points: " + mole_points);
                //System.out.println("mole_multi: " + mole_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getGrotesqueGuardians().level())) {
                this.grotesque_guardians_kc = result.getGrotesqueGuardians().level();
                this.grotesque_guardians_points = this.grotesque_guardians_kc * this.grotesque_guardians_multi;
                //System.out.println("grotesque_guardians_kc : " + grotesque_guardians_kc);
                //System.out.println("grotesque_guardians_points: " + grotesque_guardians_points);
                //System.out.println("grotesque_guardians_multi: " + grotesque_guardians_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getHespori().level())) {
                this.hespori_kc = result.getHespori().level();
                this.hespori_points = this.hespori_kc * this.hespori_multi;
                //System.out.println("hespori_kc : " + hespori_kc);
                //System.out.println("hespori_points: " + hespori_points);
                //System.out.println("hespori_multi: " + hespori_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getKalphiteQueen().level())) {
                this.kalphite_queen_kc = result.getKalphiteQueen().level();
                this.kalphite_queen_points = this.kalphite_queen_kc * this.kalphite_queen_multi;
                //System.out.println("kalphite_queen_kc : " + kalphite_queen_kc);
                //System.out.println("kalphite_queen_points: " + kalphite_queen_points);
                //System.out.println("kalphite_queen_multi: " + kalphite_queen_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getKingBlackDragon().level())) {
                this.kbd_kc = result.getKingBlackDragon().level();
                this.kbd_points = this.kbd_kc * this.kbd_multi;
                //System.out.println("kbd_kc : " + kbd_kc);
                //System.out.println("kbd_points: " + kbd_points);
                //System.out.println("kbd_multi: " + kbd_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getKraken().level())) {
                this.kraken_kc = result.getKraken().level();
                this.kraken_points = this.kraken_kc * this.kraken_multi;
                //System.out.println("kraken_kc : " + kraken_kc);
                //System.out.println("kraken_points: " + kraken_points);
                //System.out.println("kraken_multi: " + kraken_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getKreearra().level())) {
                this.arma_kc = result.getKreearra().level();
                this.arma_points = this.arma_kc * this.arma_multi;
                //System.out.println("arma_kc : " + arma_kc);
                //System.out.println("arma_points: " + arma_points);
                //System.out.println("arma_multi: " + arma_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getKrilTsutsaroth().level())) {
                this.zammy_kc = result.getKrilTsutsaroth().level();
                this.zammy_points = this.zammy_kc * this.zammy_multi;
                //System.out.println("zammy_kc : " + zammy_kc);
                //System.out.println("zammy_points: " + zammy_points);
                //System.out.println("zammy_multi: " + zammy_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getMimic().level())) {
                this.mimic_kc = result.getMimic().level();
                this.mimic_points = this.mimic_kc * this.mimic_multi;
                //System.out.println("mimic_kc : " + mimic_kc);
                //System.out.println("mimic_points: " + mimic_points);
                //System.out.println("mimic_multi: " + mimic_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getNex().level())) {
                this.nex_kc = result.getNex().level();
                this.nex_points = this.nex_kc * this.nex_multi;
                //System.out.println("nex_kc : " + nex_kc);
                //System.out.println("nex_points: " + nex_points);
                //System.out.println("nex_multi: " + nex_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getNightmare().level())) {
                this.nightmare_kc = result.getNightmare().level();
                this.nightmare_points = this.nightmare_kc * this.nightmare_multi;
                //System.out.println("nightmare_kc : " + nightmare_kc);
                //System.out.println("nightmare_points: " + nightmare_points);
                //System.out.println("nightmare_multi: " + nightmare_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getPhosanisNightmare().level())) {
                this.nightmare_phosanis_kc = result.getPhosanisNightmare().level();
                this.nightmare_phosanis_points = this.nightmare_phosanis_kc * this.nightmare_phosanis_multi;
                //System.out.println("nightmare_phosanis_kc : " + nightmare_phosanis_kc);
                //System.out.println("nightmare_phosanis_points: " + nightmare_phosanis_points);
                //System.out.println("nightmare_phosanis_multi: " + nightmare_phosanis_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getObor().level())) {
                this.obor_kc = result.getObor().level();
                this.obor_points = this.obor_kc * this.obor_multi;
                //System.out.println("obor_kc : " + obor_kc);
                //System.out.println("obor_points: " + obor_points);
                //System.out.println("obor_multi: " + obor_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getSarachnis().level())) {
                this.sarachnis_kc = result.getSarachnis().level();
                this.sarachnis_points = this.sarachnis_kc * this.sarachnis_multi;
                //System.out.println("sarachnis_kc : " + sarachnis_kc);
                //System.out.println("sarachnis_points: " + sarachnis_points);
                //System.out.println("sarachnis_multi: " + sarachnis_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getScorpia().level())) {
                this.scorpia_kc = result.getScorpia().level();
                this.scorpia_points = this.scorpia_kc * this.scorpia_multi;
                //System.out.println("scorpia_kc : " + scorpia_kc);
                //System.out.println("scorpia_points: " + scorpia_points);
                //System.out.println("scorpia_multi: " + scorpia_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getSkotizo().level())) {
                this.skotizo_kc = result.getSkotizo().level();
                this.skotizo_points = this.skotizo_kc * this.skotizo_multi;
                //System.out.println("skotizo_kc : " + skotizo_kc);
                //System.out.println("skotizo_points: " + skotizo_points);
                //System.out.println("skotizo_multi: " + skotizo_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getTempoross().level())) {
                this.tempoross_kc = result.getTempoross().level();
                this.tempoross_points = this.tempoross_kc * this.tempoross_multi;
                //System.out.println("tempoross_kc : " + tempoross_kc);
                //System.out.println("tempoross_points: " + tempoross_points);
                //System.out.println("tempoross_multi: " + tempoross_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getGauntlet().level())) {
                this.gauntlet_kc = result.getGauntlet().level();
                this.gauntlet_points = this.gauntlet_kc * this.gauntlet_multi;
                //System.out.println("gauntlet_kc : " + gauntlet_kc);
                //System.out.println("gauntlet_points: " + gauntlet_points);
                //System.out.println("gauntlet_multi: " + gauntlet_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getCorruptedGauntlet().level())) {
                this.corrupted_gauntlet_kc = result.getCorruptedGauntlet().level();
                this.corrupted_gauntlet_points = this.corrupted_gauntlet_kc * this.corrupted_gauntlet_multi;
                //System.out.println("corrupted_gauntlet_kc : " + corrupted_gauntlet_kc);
                //System.out.println("corrupted_gauntlet_points: " + corrupted_gauntlet_points);
                //System.out.println("corrupted_gauntlet_multi: " + corrupted_gauntlet_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getTheatreOfBlood().level())) {
                this.tob_kc = result.getTheatreOfBlood().level();
                this.tob_points = this.tob_kc * this.tob_multi;
                //System.out.println("tob_kc : " + tob_kc);
                //System.out.println("tob_points: " + tob_points);
                //System.out.println("tob_multi: " + tob_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getTheatreOfBloodHardMode().level())) {
                this.tob_hm_kc = result.getTheatreOfBloodHardMode().level();
                this.tob_hm_points = this.tob_hm_kc * this.tob_hm_multi;
                //System.out.println("tob_hm_kc : " + tob_hm_kc);
                //System.out.println("tob_hm_points: " + tob_hm_points);
                //System.out.println("tob_hm_multi: " + tob_hm_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getThermonuclearSmokeDevil().level())) {
                this.thermy_kc = result.getThermonuclearSmokeDevil().level();
                this.thermy_points = this.thermy_kc * this.thermy_multi;
                //System.out.println("thermy_kc : " + thermy_kc);
                //System.out.println("thermy_points: " + thermy_points);
                //System.out.println("thermy_multi: " + thermy_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getTzKalZuk().level())) {
                this.zuk_kc = result.getTzKalZuk().level();
                this.zuk_points = this.zuk_kc * this.zuk_multi;
                //System.out.println("zuk_kc : " + zuk_kc);
                //System.out.println("zuk_points: " + zuk_points);
                //System.out.println("zuk_multi: " + zuk_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getTzTokJad().level())) {
                this.jad_kc = result.getTzTokJad().level();
                this.jad_points = this.jad_kc * this.jad_multi;
                //System.out.println("jad_kc : " + jad_kc);
                //System.out.println("jad_points: " + jad_points);
                //System.out.println("jad_multi: " + jad_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getVenenatis().level())) {
                this.venenatis_kc = result.getVenenatis().level();
                this.venenatis_points = this.venenatis_kc * this.venenatis_multi;
                //System.out.println("venenatis_kc : " + venenatis_kc);
                //System.out.println("venenatis_points: " + venenatis_points);
                //System.out.println("venenatis_multi: " + venenatis_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getVetion().level())) {
                this.vetion_kc = result.getVetion().level();
                this.vetion_points = this.vetion_kc * this.vetion_multi;
                //System.out.println("vetion_kc : " + vetion_kc);
                //System.out.println("vetion_points: " + vetion_points);
                //System.out.println("vetion_multi: " + vetion_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getVorkath().level())) {
                this.vorkath_kc = result.getVorkath().level();
                this.vorkath_points = this.vorkath_kc * this.vorkath_multi;
                //System.out.println("vorkath_kc : " + vorkath_kc);
                //System.out.println("vorkath_points: " + vorkath_points);
                //System.out.println("vorkath_multi: " + vorkath_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getWintertodt().level())) {
                this.wintertodt_kc = result.getWintertodt().level();
                this.wintertodt_points = this.wintertodt_kc * this.wintertodt_multi;
                //System.out.println("wintertodt_kc : " + wintertodt_kc);
                //System.out.println("wintertodt_points: " + wintertodt_points);
                //System.out.println("wintertodt_multi: " + wintertodt_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getZalcano().level())) {
                this.zalcano_kc = result.getZalcano().level();
                this.zalcano_points = this.zalcano_kc * this.zalcano_multi;
                //System.out.println("zalcano_kc : " + zalcano_kc);
                //System.out.println("zalcano_points: " + zalcano_points);
                //System.out.println("zalcano_multi: " + zalcano_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());

                }
            if (isPositive(result.getZulrah().level())) {
                this.zulrah_kc = result.getZulrah().level();
                this.zulrah_points = this.zulrah_kc * this.zulrah_multi;
                //System.out.println("zulrah_kc : " + zulrah_kc);
                //System.out.println("zulrah_points: " + zulrah_points);
                //System.out.println("zulrah_multi: " + zulrah_multi);
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                //System.out.println(System.lineSeparator());
                }

            double points = sire_points+ hydra_points+ barrows_points+ bryophyta_points+ callisto_points+ cerberus_points+
                    cox_points+ cox_hm_points+ chaos_elly_points+ chaos_fanatic_points+ sara_points+ corp_points+
                    crazy_arch_points+ dag_prime_points+ dag_supreme_points+ dag_rex_points+ deranged_arch_points+
                    bandos_points+ mole_points+ grotesque_guardians_points+ hespori_points+ kalphite_queen_points+
                    kbd_points+ kraken_points+ arma_points+ zammy_points+ mimic_points+ nex_points+ nightmare_points+
                    nightmare_phosanis_points+ obor_points+ sarachnis_points+ scorpia_points+ skotizo_points+ tempoross_points+
                    gauntlet_points+ corrupted_gauntlet_points+ tob_points+ tob_hm_points+ thermy_points+ zuk_points+ jad_points+
                    venenatis_points+ vetion_points+ vorkath_points+ wintertodt_points+ zalcano_points+ zulrah_points;


            //System.out.println("TestPoints for : " + user + " " + points);
            return points;

        }
        catch(IOException e){
            e.printStackTrace();
        }
        return 0;
    }



    public static HiscoreResult parseResponse(String username, String responseStr) throws IOException {
        CSVParser parser = CSVParser.parse(responseStr, CSVFormat.DEFAULT);

        HiscoreResultBuilder hiscoreBuilder = new HiscoreResultBuilder(username);
        int count = 0;

        for (CSVRecord record : parser.getRecords()) {
            if (count++ >= HiscoreSkill.values().length) {
                break; // rest is other things?
            }
            // rank, level, experience

            int rank = Integer.parseInt(record.get(0));
            int level = Integer.parseInt(record.get(1));

            // items that are not skills do not have an experience parameter
            long experience = -1;
            if (record.size() == 3) {
                experience = Long.parseLong(record.get(2));
            }
            Skill skill = new Skill(rank, level, experience);
            hiscoreBuilder.setNextSkill(skill);
        }
        return hiscoreBuilder.build();
    }


}
