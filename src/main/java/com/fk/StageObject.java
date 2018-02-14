package com.fk;

public class StageObject {

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("StageObject{");
        sb.append("inputText='").append(inputText).append('\'');
        sb.append(", tokenizerOutput='").append(tokenizerOutput).append('\'');
        sb.append(", punctuationCorrectorOutput='").append(punctuationCorrectorOutput).append('\'');
        sb.append(", caseCorrectorOutput='").append(caseCorrectorOutput).append('\'');
        sb.append('}');
        return sb.toString();
    }

    private String inputText;
    private String tokenizerOutput;
    private String punctuationCorrectorOutput;
    private String caseCorrectorOutput;

    public StageObject(String inputText) {
        this.inputText = inputText;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String getTokenizerOutput() {
        return tokenizerOutput;
    }

    public void setTokenizerOutput(String tokenizerOutput) {
        this.tokenizerOutput = tokenizerOutput;
    }

    public String getCaseCorrectorOutput() {
        return caseCorrectorOutput;
    }

    public void setCaseCorrectorOutput(String caseCorrectorOutput) {
        this.caseCorrectorOutput = caseCorrectorOutput;
    }

    public String getPunctuationCorrectorOutput() {
        return punctuationCorrectorOutput;
    }

    public void setPunctuationCorrectorOutput(String punctuationCorrectorOutput) {
        this.punctuationCorrectorOutput = punctuationCorrectorOutput;
    }
}
