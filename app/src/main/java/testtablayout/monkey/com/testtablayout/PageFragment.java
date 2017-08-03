package testtablayout.monkey.com.testtablayout;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Description:
 * Author: lanjing
 * Time: 2017/6/5 15:07
 */

public class PageFragment extends Fragment {
    public static final String EXTRA_TITLE = "title";

    private TextView mTvPageInfo;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page,container,false);
        mTvPageInfo = (TextView)view.findViewById(R.id.tv_page_info);
        Bundle args = getArguments();
        if(args!=null){
            String title = args.getString(EXTRA_TITLE);
            if(!TextUtils.isEmpty(title)){
                mTvPageInfo.setText(title);
            }
        }
        return view;
    }
}
