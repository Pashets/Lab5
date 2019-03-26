public class Sentence {

    private Word[] value;
    private int wordQuatit;

    private int fIndex;
    private int lIndex;



    public Sentence(Word[] value) {
        this.value = value;
        wordQuatit = this.value.length;

    }

    public Word[] getValue() {
        return value;
    }

    public void setValue(Word[] value) {
        this.value = value;
    }


    public Word[] getMinusLast() {

        if (value.length == 1 && value[value.length - 1].getMinusLast() == null) {
            return null;
        }

        if (value[value.length - 1].getMinusLast() == null) {
            Word[] newValue = new Word[value.length - 1];
            for (int i = 0; i < value.length - 1; i++) {
                newValue[i] = value[i];

            }
            return newValue;
        } else {
            Word[] newValue = new Word[value.length];
            for (int i = 0; i < value.length - 1; i++) {
                newValue[i] = value[i];

            }
            newValue[value.length - 1] = new Word(value[value.length - 1].getMinusLast());

            return newValue;

        }


    }

    public int getWordQuatit() {
        return wordQuatit;
    }

    public void setWordQuatit(int wordQuatit) {
        this.wordQuatit = wordQuatit;
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

    public Word[] getMinusFirst() {

        if (value.length <= 1 && value[0].getMinusFirst() == null) {
            return null;
        }

        if (value[0].getMinusFirst() == null) {
            Word[] newValue = new Word[value.length - 1];
            for (int i = 0; i < value.length - 1; i++) {
                newValue[i] = value[i + 1];

            }
            return newValue;
        } else {

            Word[] newValue = new Word[value.length];
            newValue[0] = new Word(value[0].getMinusFirst());

            for (int i = 1; i < value.length; i++) {
                newValue[i] = value[i];

            }


            return newValue;

        }



    }

    public char getChar(int index) {


        if(value.length == 1){
            return value[0].getChar(index);
        }
        for (int i = 0; i < value.length - 1; i++) {

            if (value[i].getlIndex() < index && index <= value[i + 1].getlIndex()) {
                return value[i + 1].getChar(index);
            }
            else if (i == 0 && value[i].getlIndex() >= index){
                return value[i].getChar(index);
            }


        }
        return 's';
    }
}
