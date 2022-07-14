/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotelmaingamen;

/**
 *
 * @author yb
 */
public class Buken {

    private String id;
    private String buken_name;
    private String address;
    private String eki;
    private String grade;
    private String create_date;
    private String modify_date;

    public Buken() {

    }

    public String getId() {
        return id;
    }

    public String getBuken_name() {
        return buken_name;
    }

    public String getAddress() {
        return address;
    }

    public String getEki() {
        return eki;
    }

    public String getGrade() {
        return grade;
    }

    public String getCreate_date() {
        return create_date;
    }

    public String getModify_date() {
        return modify_date;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setBuken_name(String buken_name) {
        this.buken_name = buken_name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEki(String eki) {
        this.eki = eki;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }

    public void setModify_date(String modify_date) {
        this.modify_date = modify_date;
    }

}
