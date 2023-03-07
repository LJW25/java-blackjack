package blackjack.view;

import java.util.List;
import java.util.Map;

public class OutputView {
    private static final OutputView INSTANCE = new OutputView();
    private static final String ERROR = "[ERROR] : ";

    public static OutputView getInstance() {
        return INSTANCE;
    }

    public void printInitialCardMessage(List<String> playerNames) {
        System.out.println();
        System.out.println("딜러와 " + String.join(", ", playerNames) + "에게 2장을 나누었습니다.");
    }

    public void printInitialPlayerCards(String playerName, List<String> cardNames) {
        System.out.println(playerName + "카드: " + String.join(", ", cardNames));
    }

    public void printDealerReceived() {
        System.out.println("\n딜러는 16이하라 한장의 카드를 더 받았습니다.\n");
    }

    public void printFinalCards(String name, List<String> cardNames, int score) {
        System.out.println(name + "카드: " + String.join(", ", cardNames) + " - 결과: " + score);
    }

    public void printDealerResults(Map<String, Integer> dealerResults) {
        System.out.println(System.lineSeparator() + "## 최종 승패");
        System.out.print("딜러: ");

        dealerResults.keySet().forEach(result -> {
            if (dealerResults.get(result) > 0) {
                System.out.print(dealerResults.get(result) + result);
            }
        });

        System.out.println();
    }

    public void printPlayerResult(String playerName, String playerResult) {
        System.out.println(playerName + ": " + playerResult);
    }

    public void printErrorMessage(String errorMessage) {
        System.out.println(ERROR + errorMessage);
    }
}
