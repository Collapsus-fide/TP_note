package game;

public interface ICard {
    enum val{
        two,
        three,
        four,
        five,
        six,
        seven,
        eight,
        nine,
        ten,
        J,
        Q,
        R,
        A
    }
    enum suit{
        club,
        heart,
        spade,
        diamond

    }

    public void display();

}
