package baseball;

public class BaseBallTeam {
    // フィールド
    public String name;
    public int win;
    public int lose;
    public int draw;


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

}
