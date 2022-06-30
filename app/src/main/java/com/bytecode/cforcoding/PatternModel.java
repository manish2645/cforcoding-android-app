package com.bytecode.cforcoding;

public class PatternModel {
    String Text;
    int image;
    String SourceCode;
    int Icon;
    int Output;

    public String getSourceCode() {
        return SourceCode;
    }

    public void setSourceCode(String sourceCode) {
        SourceCode = sourceCode;
    }

    public PatternModel() {
    }

    public PatternModel(String text, int image,String sourceCode,int icon,int output) {
        Text = text;
        this.image = image;
        SourceCode = sourceCode;
        this.Icon = icon;
        this.Output = output;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIcon() {
        return Icon;
    }

    public void setIcon(int icon) {
        Icon = icon;
    }

    public int getOutput() {
        return Output;
    }

    public void setOutput(int output) {
        Output = output;
    }
}
