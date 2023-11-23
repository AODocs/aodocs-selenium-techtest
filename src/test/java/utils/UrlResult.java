package utils;

public class UrlResult {
    private String url;
    private Boolean result;

    public UrlResult(String u, Boolean r){
        url = u;
        result = r;
    }

    public String getUrl(){
        return url;
    }

    public Boolean getResult(){
        return result;
    }
}
