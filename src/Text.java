public class Text {


    private Sentence[] value;
    private int sentenceQuantity = 0;
    private int wordQuantity = 0;
    private int charQuantity = 0;


    @Override
    public String toString() {

        String text = "";

        for (Sentence i : value) {
            for (Word j : i.getValue()) {
                for (Letter k : j.getValue()) {
                    text += k.getValue();

                }
                text += " ";
            }
            text += ".";
        }
        return text;
    }

    public int getWordQuantity() {
        return wordQuantity;
    }

    public int getCharQuantity() {
        return charQuantity;
    }

    public int getSentenceQuantity() {
        return sentenceQuantity;
    }

    public Text(String value) {

        String[] text = value.split("\\.");
        Sentence[] txt = new Sentence[text.length];


        int letterIndex = 0;


        sentenceQuantity = text.length;

        for (int i = 0; i < text.length; i++) {

            String[] words = text[i].split(" ");
            Word[] sentence = new Word[words.length];

            wordQuantity += words.length;


            for (int j = 0; j < words.length; j++) {

                char[] ch = words[j].toCharArray();

                charQuantity += ch.length;

                Letter[] word = new Letter[ch.length];

                for (int k = 0; k < ch.length; k++) {

                    word[k] = new Letter(ch[k]);
                    word[k].setIndex(letterIndex);
                    letterIndex++;

                }

                sentence[j] = new Word(word);
                sentence[j].setlIndex(letterIndex - 1);


            }

            txt[i] = new Sentence(sentence);
            txt[i].setlIndex(letterIndex - 1);

        }
        this.value = txt;

    }


    public Text(Sentence[] value) {

        this.value = value;

        for (Sentence i : value
        ) {
            sentenceQuantity++;

            for (Word j : i.getValue()
            ) {
                wordQuantity++;
                for (Letter k : j.getValue()
                ) {
                    charQuantity++;


                }

            }

        }
    }

    public Sentence[] getValue() {
        return value;
    }

    public void setValue(Sentence[] value) {
        this.value = value;
    }


    public Sentence[] getMinusLast() {

        if (value.length == 1 && value[value.length - 1].getMinusLast() == null) {
            return null;
        }

        if (value[value.length - 1].getMinusLast() == null) {
            Sentence[] newValue = new Sentence[value.length - 1];
            for (int i = 0; i < value.length - 1; i++) {
                newValue[i] = value[i];

            }
            newValue[newValue.length - 1].setlIndex(value[value.length - 1].getlIndex() - 1);
            return newValue;
        } else {
            Sentence[] newValue = new Sentence[value.length];
            for (int i = 0; i < value.length - 1; i++) {
                newValue[i] = value[i];

            }
            newValue[value.length - 1] = new Sentence(value[value.length - 1].getMinusLast());
            newValue[newValue.length - 1].setlIndex(value[value.length - 1].getlIndex() - 1);
            return newValue;

        }


    }


    public Sentence[] getMinusFirst() {

        if (value.length <= 1 && value[0].getMinusLast() == null) {
            return null;

        }

        if (value[0].getMinusLast() == null) {
            Sentence[] newValue = new Sentence[value.length - 1];
            for (int i = 0; i < value.length - 1; i++) {
                newValue[i] = value[i + 1];

            }
            newValue[0].setlIndex(value[0].getlIndex());
            return newValue;
        } else {
            Sentence[] newValue = new Sentence[value.length];
            for (int i = 1; i < value.length; i++) {
                newValue[i] = value[i];

            }
            newValue[0] = new Sentence(value[0].getMinusFirst());
            newValue[0].setlIndex(value[0].getlIndex());
            return newValue;

        }


    }


    public char getChar(int index) {

        int l = value.length;
        if (l == 1) {
            return value[0].getChar(index);
        }
        for (int i = 0; i < value.length - 1; i++) {

            int ki = value[i].getlIndex();
            if (i == 0 && ki >= index) {
                return value[i].getChar(index);
            }

            int a = value[i].getlIndex();
            int b = value[i + 1].getlIndex();

            if (a < index && index <= b) {
                return value[i + 1].getChar(index);
            }
        }
        return 't';
    }


}

