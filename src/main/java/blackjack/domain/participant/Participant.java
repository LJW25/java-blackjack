package blackjack.domain.participant;

import blackjack.domain.card.Card;
import blackjack.domain.card.CardNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Participant {

    protected final List<Card> cards;
    protected final Score score;

    protected Participant() {
        this.cards = new ArrayList<>();
        this.score = new Score();
    }

    abstract boolean isAbleToReceive();

    public abstract String getName();

    public void receiveCard(Card card) {
        cards.add(card);
    }

    protected List<CardNumber> extractCardNumbers() {
        return cards.stream()
                .map(Card::getTrumpNumber)
                .collect(Collectors.toList());
    }

    public List<String> getCardNames() {
        return cards.stream()
                .map(Card::getCardName)
                .collect(Collectors.toList());
    }

    public List<Card> getCards() {
        return Collections.unmodifiableList(cards);
    }

    public int getScore() {
        return score.getScore();
    }
}
