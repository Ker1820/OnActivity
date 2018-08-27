package util;

public enum Languages {
    ENGLISH("English"),RUSSIAN("Russian"),UKRAINIAN("Ukrainian");

    private String language;

    Languages(String language){
        this.language = language;
    }

    public String getLanguage(){
        return this.language;
    }
}
