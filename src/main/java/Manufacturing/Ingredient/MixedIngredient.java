package Manufacturing.Ingredient;

import Presentation.Protocol.OutputManager;

import java.util.Arrays;
import java.util.List;

/**
 * 混合原料，指多种原料混合的罐头成分。
 * <b>作为 Composite模式 的一部分</b>
 * @author 卓正一
 */
public abstract class MixedIngredient implements Ingredient {

    /**
     * 打印时默认对原料清单内的内容递归调用 showContents。
     * @return 混合原料的内容物。
     */
    @Override
    public final String showContents() {
        StringBuilder ret = new StringBuilder(
                OutputManager.getInstance().selectStringForCurrentLanguage(
                        zhCnName,
                        zhTwName,
                        enName
                )
                + " (");
        for (Ingredient i : contentIngredients ) {
            ret.append(i.showContents());
        }
        ret.append(") ");
        return ret.toString();
    }

    /**
     * 混合原料构造器
     * @param ingredients 组成这个原料的所有子原料，通过变长参数列表传入。
     */
    public MixedIngredient(Ingredient... ingredients) {
        contentIngredients = Arrays.asList(ingredients);
    }

    /**
     * 设置多语言名字
     * @author 卓正一
     * @since 2021-10-12 4:17 PM
     */
    public void setName(String zhCnName, String zhTwName, String enName) {
        this.zhCnName = zhCnName;
        this.zhTwName = zhTwName;
        this.enName = enName;
    }

    /**
     * 以下三属性是为了多语言输出准备的。
     * @since 2021-10-11 11:02 PM
     */
    private String zhCnName;
    private String zhTwName;
    private String enName;

    public void addIngredient(Ingredient i) {
        contentIngredients.add(i);
    }

    protected List<Ingredient> contentIngredients;
}
