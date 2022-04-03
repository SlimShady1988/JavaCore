package Core.JSONandXMLparsers.json;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class CurrencyRate {
    @SerializedName("ccy")
    private String from;
    @SerializedName("base_ccy")
    private String to;
    private BigDecimal bue;
    private BigDecimal sale;

    public CurrencyRate() {
    }

    public CurrencyRate(String from, String to, BigDecimal bue, BigDecimal sale) {
        this.from = from;
        this.to = to;
        this.bue = bue;
        this.sale = sale;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", bue=" + bue +
                ", sale=" + sale +
                '}';
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public BigDecimal getBue() {
        return bue;
    }

    public void setBue(BigDecimal bue) {
        this.bue = bue;
    }

    public BigDecimal getSale() {
        return sale;
    }

    public void setSale(BigDecimal sale) {
        this.sale = sale;
    }
}

