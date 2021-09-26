
package BT80;

import java.io.Serializable;
import java.util.ArrayList;

public class cacloaicaixanh implements Serializable {

    private ArrayList<caixanh> listCate = new ArrayList<caixanh>();

    public caixanh findCateById(String id) {

        for (caixanh cate : listCate) {

            if (cate.getCateId().equalsIgnoreCase(id)) {
                return cate;
            }

        }

        return null;
    }

    public void addCate(caixanh cate) {

        caixanh cateFind = findCateById(cate.getCateId());

        if (cateFind != null) {
            cateFind = cate;
        } else {
            listCate.add(cate);
        }

    }

    public void removeCateById(String id) {

        caixanh cateFind = findCateById(id);
        if (cateFind != null) {
            listCate.remove(cateFind);
        }

    }

    public ArrayList<caixanh> getList() {

        return listCate;

    }

}
