# InjectView
- 尝试一下三方库
- 使用：
> 
@InjectView(R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectManager.inject(this);
    }
}
    
       
