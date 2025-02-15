package com.devonfw.tools.ide.tool.oc;

import com.devonfw.tools.ide.context.IdeContext;
import com.devonfw.tools.ide.tool.ToolCommandlet;

import java.util.Set;

/**
 * {@link ToolCommandlet} for <a href="https://docs.openshift.com/">Openshift CLI</a>.
 */
public class Oc extends ToolCommandlet {

  /**
   * The constructor.
   *
   * @param context the {@link IdeContext}
   */
  public Oc(IdeContext context) {

    super(context, "oc", Set.of(TAG_CLOUD));
  }

}
