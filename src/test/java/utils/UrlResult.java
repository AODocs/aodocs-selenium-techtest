package utils;

public class UrlResult {
    private String url;
    private Boolean result;

    public UrlResult(String urlString, Boolean resultBoolean){
        url = urlString;
        result = resultBoolean;
    }

    public String getUrl(){
        return url;
    }

    public Boolean getResult(){
        return result;
    }
}
