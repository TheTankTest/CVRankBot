package net.defiancecoding.bot.util.highscores;

import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
public class HiscoreResultBuilder {

    private final String player;
    private final List<Skill> skills = new ArrayList<>();

    public void setNextSkill(Skill skill) {
        skills.add(skill);
    }

    public Skill getSkill(int index) {
        return skills.get(index);
    }

    public HiscoreResult build() {
        HiscoreResult hiscoreResult = new HiscoreResult();
        hiscoreResult.setPlayer(player);
        int index = 0;
        hiscoreResult.setOverall(skills.get(index++));
        hiscoreResult.setAttack(skills.get(index++));
        hiscoreResult.setDefence(skills.get(index++));
        hiscoreResult.setStrength(skills.get(index++));
        hiscoreResult.setHitpoints(skills.get(index++));
        hiscoreResult.setRanged(skills.get(index++));
        hiscoreResult.setPrayer(skills.get(index++));
        hiscoreResult.setMagic(skills.get(index++));
        hiscoreResult.setCooking(skills.get(index++));
        hiscoreResult.setWoodcutting(skills.get(index++));
        hiscoreResult.setFletching(skills.get(index++));
        hiscoreResult.setFishing(skills.get(index++));
        hiscoreResult.setFiremaking(skills.get(index++));
        hiscoreResult.setCrafting(skills.get(index++));
        hiscoreResult.setSmithing(skills.get(index++));
        hiscoreResult.setMining(skills.get(index++));
        hiscoreResult.setHerblore(skills.get(index++));
        hiscoreResult.setAgility(skills.get(index++));
        hiscoreResult.setThieving(skills.get(index++));
        hiscoreResult.setSlayer(skills.get(index++));
        hiscoreResult.setFarming(skills.get(index++));
        hiscoreResult.setRunecraft(skills.get(index++));
        hiscoreResult.setHunter(skills.get(index++));
        hiscoreResult.setConstruction(skills.get(index++));
        hiscoreResult.setLeaguePoints(skills.get(index++));
        hiscoreResult.setBountyHunterHunter(skills.get(index++));
        hiscoreResult.setBountyHunterRogue(skills.get(index++));
        hiscoreResult.setClueScrollAll(skills.get(index++));
        hiscoreResult.setClueScrollBeginner(skills.get(index++));
        hiscoreResult.setClueScrollEasy(skills.get(index++));
        hiscoreResult.setClueScrollMedium(skills.get(index++));
        hiscoreResult.setClueScrollHard(skills.get(index++));
        hiscoreResult.setClueScrollElite(skills.get(index++));
        hiscoreResult.setClueScrollMaster(skills.get(index++));
        hiscoreResult.setLastManStanding(skills.get(index++));
        hiscoreResult.setSoulWarsZeal(skills.get(index++));
        if (skills.size() > 84) {
            hiscoreResult.setRiftsClosed(skills.get(index++));
        }
        hiscoreResult.setPvp_arena(skills.get(index++));
        // seasonal doesn't have boss hiscores
        if (index < skills.size()) {
            hiscoreResult.setAbyssalSire(skills.get(index++));
            hiscoreResult.setAlchemicalHydra(skills.get(index++));
            hiscoreResult.setBarrowsChests(skills.get(index++));
            hiscoreResult.setBryophyta(skills.get(index++));
            hiscoreResult.setCallisto(skills.get(index++));
            hiscoreResult.setCerberus(skills.get(index++));
            hiscoreResult.setChambersOfXeric(skills.get(index++));
            hiscoreResult.setChambersOfXericChallengeMode(skills.get(index++));
            hiscoreResult.setChaosElemental(skills.get(index++));
            hiscoreResult.setChaosFanatic(skills.get(index++));
            hiscoreResult.setCommanderZilyana(skills.get(index++));
            hiscoreResult.setCorporealBeast(skills.get(index++));
            hiscoreResult.setCrazyArchaeologist(skills.get(index++));
            hiscoreResult.setDagannothPrime(skills.get(index++));
            hiscoreResult.setDagannothRex(skills.get(index++));
            hiscoreResult.setDagannothSupreme(skills.get(index++));
            hiscoreResult.setDerangedArchaeologist(skills.get(index++));
            hiscoreResult.setGeneralGraardor(skills.get(index++));
            hiscoreResult.setGiantMole(skills.get(index++));
            hiscoreResult.setGrotesqueGuardians(skills.get(index++));
            hiscoreResult.setHespori(skills.get(index++));
            hiscoreResult.setKalphiteQueen(skills.get(index++));
            hiscoreResult.setKingBlackDragon(skills.get(index++));
            hiscoreResult.setKraken(skills.get(index++));
            hiscoreResult.setKreearra(skills.get(index++));
            hiscoreResult.setKrilTsutsaroth(skills.get(index++));
            hiscoreResult.setMimic(skills.get(index++));
            hiscoreResult.setNex(skills.get(index++));
            hiscoreResult.setNightmare(skills.get(index++));
            hiscoreResult.setPhosanisNightmare(skills.get(index++));
            hiscoreResult.setObor(skills.get(index++));
            hiscoreResult.setSarachnis(skills.get(index++));
            hiscoreResult.setScorpia(skills.get(index++));
            hiscoreResult.setSkotizo(skills.get(index++));
            hiscoreResult.setTempoross(skills.get(index++));
            hiscoreResult.setGauntlet(skills.get(index++));
            hiscoreResult.setCorruptedGauntlet(skills.get(index++));
            hiscoreResult.setTheatreOfBlood(skills.get(index++));
            hiscoreResult.setTheatreOfBloodHardMode(skills.get(index++));
            hiscoreResult.setThermonuclearSmokeDevil(skills.get(index++));
            hiscoreResult.setTzKalZuk(skills.get(index++));
            hiscoreResult.setTzTokJad(skills.get(index++));
            hiscoreResult.setVenenatis(skills.get(index++));
            hiscoreResult.setVetion(skills.get(index++));
            hiscoreResult.setVorkath(skills.get(index++));
            hiscoreResult.setWintertodt(skills.get(index++));
            hiscoreResult.setZalcano(skills.get(index++));
            hiscoreResult.setZulrah(skills.get(index++));
        }
        hiscoreResult.setCombat(Utils.getCombatLevelPrecise(hiscoreResult.getAttack().level(), hiscoreResult.getStrength().level(), hiscoreResult.getDefence().level(), hiscoreResult.getHitpoints().level(), hiscoreResult.getRanged().level(), hiscoreResult.getPrayer().level(), hiscoreResult.getMagic().level()));
        return hiscoreResult;
    }

    @Override
    public String toString() {
        return "HiscoreResultBuilder{" +
                "player='" + player + '\'' +
                ", skills=" + skills +
                '}';
    }
}