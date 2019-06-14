public class Card {

    SuitType suitType;
    RankType rankType;

    public Card(SuitType suitType, RankType rankType){
        this.suitType = suitType;
        this.rankType = rankType;
    }

    public SuitType getSuit() {
        return this.suitType;
    }

    public RankType getRank() {
        return this.rankType;
    }


}
