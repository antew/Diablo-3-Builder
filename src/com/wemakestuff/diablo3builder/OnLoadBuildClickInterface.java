
package com.wemakestuff.diablo3builder;

import com.wemakestuff.diablo3builder.model.ClassBuild;

public interface OnLoadBuildClickInterface
{
    public void onLoadBuildClick(ClassBuild build);
    
    public void onLoadBuildDismiss();

    public void onDeleteBuild(ClassBuild build);
}
