package cuit.drawdream.view.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drawdream.R;

/**
 * class : ClassfiFragment
 * Created by 路双宁 on 2017/3/29
 * Desc : 分类的fragment
 */
public class ClassfiFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String TAG = ClassfiFragment.class.getSimpleName();
    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public ClassfiFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ClassfiFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ClassfiFragment newInstance(String param1, String param2) {
        ClassfiFragment fragment = new ClassfiFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
        Log.i(TAG,"onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_classfi, container, false);
        Log.i(TAG,"onCreateView");

        return view;
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i(TAG,"onPause");
    }
}