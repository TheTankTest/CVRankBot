package net.defiancecoding.bot.util.ranks;

public enum Ranks {

    SAPPHIRE(0, "Sapphire"),
    EMERALD(3000, "Emerald"),
    RUBY(4500, "Ruby"),
    DIAMOND(6000, "Diamond"),
    DRAGONSTONE(8000, "Dragonstone"),
    ONYX(10000, "Onyx"),
    ZENYTE(12500, "Zenyte"),
    INFERNAL(15000, "Infernal");

    private final int value;
    private final String rankName;
    Ranks(int value, String rankName){
        this.value = value; this.rankName = rankName;
    }
}
