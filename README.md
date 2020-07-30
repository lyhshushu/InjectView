# InjectView
- 尝试一下三方库
- 使用：  
 添加依赖以及使用
```
package
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
   }
}
module
dependencies {
...
implementation 'com.github.lyhshushu:InjectView:v1.1'
}
```
 ```
@InjectView(R.layout.activity_main)
public class MainActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        InjectManager.inject(this);
    }
}
 ```
