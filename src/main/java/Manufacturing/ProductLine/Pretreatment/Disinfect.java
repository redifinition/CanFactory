package Manufacturing.ProductLine.Pretreatment;


import Manufacturing.ProductLine.RawMaterial.RawMaterial;

import java.util.List;

/**
 * TODO:消毒预处理类.
 *
 * @author 孟繁霖
 * @date 2021-10-12 8:29
 */
public class Disinfect implements Pretreatment {
    @Override
    public List<RawMaterial> treat(List<RawMaterial> rawMaterialList) {
        return rawMaterialList;
    }
}