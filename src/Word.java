public class Word extends SentenceComponent {

    private Letter[] value;
    private int letterQuatity;

    private int fIndex;
    private int lIndex;

    public int getLetterQuatity() {
        return letterQuatity;
    }

    public void setLetterQuatity(int letterQuatity) {
        this.letterQuatity = letterQuatity;
    }

    public int getfIndex() {
        return fIndex;
    }

    public void setfIndex(int fIndex) {
        this.fIndex = fIndex;
    }

    public int getlIndex() {
        return lIndex;
    }

    public void setlIndex(int lIndex) {
        this.lIndex = lIndex;
    }

    public Word(Letter[] value) {
        this.value = value;
        letterQuatity = this.value.length;
    }

    public Letter[] getValue() {
        return value;
    }

    public void setValue(Letter[] value) {
        this.value = value;
    }


    public Letter[] getMinusLast() {

        if (value.length <= 1) {
            return null;
        }
        Letter[] newValue = new Letter[value.length - 1];

        for (int i = 0; i < value.length - 1; i++) {

            newValue[i] = value[i];

        }
        return newValue;

    }


    public Letter[] getMinusFirst() {

        if (value.length <= 1) {
            return null;
        }
        Letter[] newValue = new Letter[value.length - 1];

        for (int i = 0; i < value.length - 1; i++) {

            newValue[i] = value[i + 1];

        }
        return newValue;

    }

    public char getChar(int index) {

        if(value.length == 1){
            return value[0].getValue();
        }

        for (int i = 0; i < value.length - 1; i++) {

            if (value[i].getIndex() < index && index <= value[i + 1].getIndex()) {
                return value[i + 1].getValue();
            }
            else if (i == 0 && value[i].getIndex() >= index){
                return value[i].getValue();
            }



        }
        return 'w';
    }


}



