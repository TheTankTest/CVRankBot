package net.defiancecoding.bot.util.bosses;

public enum Bosses {

    abyssal_sire("abyssal_sire" ,5),
    alchemical_hydra("alchemical_hydra" ,8),
    barrows_chests("barrows_chests" ,1),
    bryophyta("bryophyta" , 2),
    callisto("callisto" , 2),
    cerberus("cerberus" , 4),
    chambers_of_xeric("chambers_of_xeric" , 8),
    chambers_of_xeric_challenge_mode("chambers_of_xeric_challenge_mode" , 12),
    chaos_elemental("chaos_elemental" , 1),
    chaos_fanatic("chaos_fanatic" , 1),
    commander_zilyana("commander_zilyana" , 2),
    corporeal_beast("corporeal_beast" , 5),
    crazy_archaeologist("crazy_archaeologist" , 1),
    dagannoth_prime("dagannoth_prime" , 2),
    dagannoth_rex("dagannoth_rex" , 1),
    dagannoth_supreme("dagannoth_supreme" , 2),
    deranged_archaeologist("deranged_archaeologist" , 1),
    general_graardor("general_graardor" , 2),
    giant_mole("giant_mole" , 1),
    grotesque_guardians("grotesque_guardians" , 3),
    hespori("hespori" , 2),
    kalphite_queen("kalphite_queen" , 3),
    king_black_dragon("king_black_dragon" , 1),
    kraken("kraken" , 3),
    kreearra("kreearra" , 3),
    kril_tsutsaroth("kril_tsutsaroth" , 2),
    mimic("mimic" , 3),
    nex("nex" , 5),
    nightmare("nightmare" , 5),
    phosanis_nightmare("phosanis_nightmare" , 10),
    obor("obor" , 1),
    sarachnis("sarachnis" ,1),
    scorpia("scorpia" , 2),
    skotizo("skotizo" , 3),
    tempoross("tempoross" , 1),
    the_gauntlet("the_gauntlet" , 5),
    the_corrupted_gauntlet("the_corrupted_gauntlet" , 12),
    theatre_of_blood("theatre_of_blood" , 8),
    theatre_of_blood_hard_mode("theatre_of_blood_hard_mode" , 12),
    thermonuclear_smoke_devil("thermonuclear_smoke_devil" , 2),
    tzkal_zuk("tzkal_zuk" , 15),
    tztok_jad("tztok_jad" , 4),
    venenatis("venenatis" , 2),
    vetion("vetion" , 2),
    vorkath("vorkath" , 3),
    wintertodt("wintertodt" , 1),
    zalcano("zalcano" , 2),
    zulrah("zulrah" , 2);


    final int value;
    final String bossName;

    Bosses(String bossName, int value){
        this.bossName = bossName;
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public String getBossName(){
        return this.bossName;
    }

}