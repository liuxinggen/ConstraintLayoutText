package com.lxg.text.constraintlayouttext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 类名： MainActivity
 * 时间：2018/1/18 12:00
 * 描述：ConstraintLayout布局的使用，参考：http://blog.csdn.net/lmj623565791/article/details/78011599
 * 修改人：
 * 修改时间：
 * 修改备注：
 *
 * @author Liu_xg
 */
public class MainActivity extends AppCompatActivity {

    /**
     * 约束位置
     * layout_constraintLeft_toLeftOf           位于左边，参数：parent(父布局)，@id/***(位于那个控件的左边);
     * layout_constraintLeft_toRightOf          左边和右边对齐
     * layout_constraintRight_toLeftOf
     * layout_constraintRight_toRightOf
     * layout_constraintTop_toTopOf
     * layout_constraintTop_toBottomOf
     * layout_constraintBottom_toTopOf           底部和头部对齐
     * layout_constraintBottom_toBottomOf
     * <p>
     * # 即文章的baseline对齐
     * layout_constraintBaseline_toBaselineOf
     * <p>
     * # 与left,right类似
     * layout_constraintStart_toEndOf
     * layout_constraintStart_toStartOf
     * layout_constraintEnd_toStartOf
     * layout_constraintEnd_toEndOf
     * <p>
     * # margin不需要解释
     * android:layout_marginStart
     * android:layout_marginEnd
     * android:layout_marginLeft
     * android:layout_marginTop
     * android:layout_marginRight
     * android:layout_marginBottom
     * <p>
     * layout_constraintHorizontal_bias        控制拉力（水平，从0开始到1，从左到右）
     * layout_constraintVertical_bias          控制拉力（垂直，从0开始到1，从上到下）
     * <p>
     * layout_constraintHorizontal_chainStyle  显示方式（水平）
     * layout_constraintVertical_chainStyle    显示方式（垂直）
     * <p>
     * layout_constraintVertical_weight        相当于layout_weight,控制权重
     * <p>
     * Guideline                               主要用于辅助布局，即类似为辅助线，横向的、纵向的。该布局是不会显示到界面上的。
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
