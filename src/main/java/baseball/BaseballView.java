package baseball;

import java.util.List;

public class BaseballView {
    // 숫자 야구게임에서 사용할 숫자의 개수
    private static final int GAME_INPUT_LENGTH = 3;
    // 숫자 야구게임의 Controller 를 이용하기 위한 Controller 객체
    private final BaseballController baseballController;

    /**
     * 게임에서 사용할 숫자의 개수를 GAME_INPUT_LENGTH 로 초기화한다
     */
    public BaseballView() {
        this.baseballController = new BaseballController(GAME_INPUT_LENGTH);
    }

    /**
     * 게임을 시작한다는 메시지를 출력하고 숫자 야구 게임 어플리케이션을 시작한다
     */
    public void startApplication() {
    }

    /**
     * 새로운 숫자 야구게임을 시작한다
     */
    private void startNewGame() {
    }

    /**
     * 플레이어가 컴퓨터가 가지고 있는 숫자를 예측해서 입력한다
     * @return 플레이어가 3가지 숫자를 모두 맞추면 true, 아니라면 false
     */
    private boolean inputNumber() {
        return false;
    }

    /**
     * 플레이어가 입력한 숫자에 대한 결과를 출력한다
     * @param result
     */
    private void printBallStrikeNothing(List<Integer> result) {
    }

    /**
     * 숫자 야구 게임을 재시작할지 여부를 결정하고 재시작하거나 종료한다
     * @return 플레이어가 재시작 한다면 true, 아닐경우 false
     */
    private boolean restartGame() {
        return false;
    }
}