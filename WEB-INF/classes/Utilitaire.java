package url;
public class Utilitaire {
    String queryString;
    String urlGet;
/*---------------------------------------Fonctions prérequis------------------------------------ */
/// Getters and Setters
    public String getQueryString() {
        return queryString;
    }

    public void setQueryString(String nouveau) {
        if(nouveau==null) {
            this.queryString="";
        } else {
            this.queryString = nouveau;
        }
    }

    public String getUrlGet() {
        return urlGet;
    }

    public void setUrlGet(String nouveau) {
        if(nouveau==null) {
            this.urlGet="";
        } else {
            this.urlGet = nouveau;
        }
    }

/// Constructeurs
    public Utilitaire() {}

    public Utilitaire(String urlGet, StringBuffer requestURL) {
        String url=requestURL.toString();
        this.setUrlGet(urlGet);
        url=url.split("//")[1];
        String result="";
        for(int i=2; i<url.split("/").length-1; i++) {
            result+=url.split("/")[i]+"/";
        }
        result+=url.split("/")[url.split("/").length-1];
        this.setQueryString(result);
    }
}
