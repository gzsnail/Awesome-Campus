package cn.edu.jxnu.awesome_campus.ui.about;

import cn.edu.jxnu.awesome_campus.ui.base.BaseWebViewActivity;

/**
 * Created by MummyDing on 16-4-23.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */
public class AppIntroActivity extends BaseWebViewActivity{
    @Override
    protected String getLink() {
        return "file:///android_asset/Awesome_CampusIntroduction.html";
    }

    @Override
    protected String getData() {
        return null;
    }

    @Override
    protected String getLinkData() {
        return null;
    }
}