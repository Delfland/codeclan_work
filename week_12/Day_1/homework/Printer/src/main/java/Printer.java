public class Printer {

    private int paperTotal;
    private int tonerTotal;

    public Printer(int paperTotal, int tonerTotal) {
        this.paperTotal = paperTotal;
        this.tonerTotal = tonerTotal;
    }

    public int getPaperTotal() {
        return this.paperTotal;
    }

    public int getTonerTotal() {
        return this.tonerTotal;
    }

    public void print(int pagesNum, int copiesNum) {
        if (this.paperTotal >= pagesNum * copiesNum) {
            this.paperTotal -= (pagesNum * copiesNum);
            this.tonerTotal -= pagesNum;
        }
    }

}