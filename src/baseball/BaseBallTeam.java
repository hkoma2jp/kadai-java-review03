package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;
    private int win;
    private int lose;
    private int draw;


    // 引数なしコンストラクタ
    public BaseBallTeam () {

    }

    // 引数ありコンストラクタ
    public BaseBallTeam (String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }


    // メソッド
    // - 勝率の計算
    public double getRate(int win, int lose, int draw) {
        double rate = (double) win / (win + lose + draw);
        return rate;
    }

    // - 呼び出し
    public void report () {
        System.out.println(
              this.name + " の2022年の成績は "
            + this.win + "勝 "
            + this.lose + "敗 "
            + this.draw + "分、"
            + "勝率は " + getRate(this.win, this.lose, this.draw)
            + "です。"
        );
    }

    // getter / setter

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name セットする name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return win
     */
    public int getWin() {
        return win;
    }

    /**
     * @param win セットする win
     */
    public void setWin(int win) {
        this.win = win;
    }

    /**
     * @return lose
     */
    public int getLose() {
        return lose;
    }

    /**
     * @param lose セットする lose
     */
    public void setLose(int lose) {
        this.lose = lose;
    }

    /**
     * @return draw
     */
    public int getDraw() {
        return draw;
    }

    /**
     * @param draw セットする draw
     */
    public void setDraw(int draw) {
        this.draw = draw;
    }

}
