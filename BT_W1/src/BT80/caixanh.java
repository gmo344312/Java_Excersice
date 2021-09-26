
package BT80;

import java.io.Serializable;
import java.util.ArrayList;


public class caixanh implements Serializable {

    private String cateId;

    private String cateName;

    private ArrayList<raumuong> listPro = new ArrayList<raumuong>();

    public String getCateId() {

        return cateId;

    }

    public void setCateId(String cateId) {

        this.cateId = cateId;

    }

    public String getCateName() {

        return cateName;
    }

    public void setCateName(String cateName) {

        this.cateName = cateName;

    }

    public caixanh(String cateId, String cateName) {

        super();

        this.cateId = cateId;

        this.cateName = cateName;

    }

    public caixanh() {

        super();

    }

    public raumuong findProductById(String id) {
        for (raumuong p : listPro) {
            if (p.getProductId().equalsIgnoreCase(id)) {
                return p;
            }
        }

        return null;

    }

    public boolean addProduct(raumuong p) {

        raumuong pFind = findProductById(p.getProductId());

        if (pFind != null) {

            System.err.println("trung san pham");
          

return false;

        }

        listPro.add(p);

        return true;

    }

    public ArrayList<raumuong> getListPro() {

        return listPro;

    }

    public void setListPro(ArrayList<raumuong> listPro) {

        this.listPro = listPro;
    }

    public void removeProductById(String id) {

        raumuong pFind = findProductById(id);

        if (pFind != null) {
            listPro.remove(pFind);
        }

    }

    public void removeProductByIndex(String index) {

        listPro.remove(index);

    }

    public int numberOfProduct() {

        return listPro.size();

    }

    public String toString() {

        return this.cateName;

    }

}


