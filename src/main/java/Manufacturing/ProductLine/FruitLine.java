package Manufacturing.ProductLine;

import Manufacturing.ProductLine.Fruit.RawMaterial;
import Manufacturing.ProductLine.pretreatment.PretreatmentApp;

import java.util.List;

/**
 * TODO:水果罐头生产线接口,预处理原料、产生罐头产品.
 *
 * @author 孟繁霖
 * @date 2021-10-11 23:47
 */
public interface FruitLine {
    PretreatmentApp pretreatmentApp = new PretreatmentApp();

    /**
     * TODO:预处理
     *
     * @param rawMaterialList :  原料列表
     * @return : java.util.List<Manufacturing.ProductLine.Fruit.RawMaterial>
     * @author 孟繁霖
     * @date 2021-10-11 23:47
     */
    List<RawMaterial> preTreat(List<RawMaterial> rawMaterialList);

    /**
     * TODO:此处写produce方法的描述
     *
     * @param count         : 能够生产的罐头数量
     * @param produceManner : 加工方式（粗加工、细加工）
     * @author 孟繁霖
     * @date 2021-10-11 23:48
     */
    void produce(int count, String produceManner);
}