package org.campagnelab.ANTLR.intentions;

/*Generated by MPS */

import jetbrains.mps.intentions.BaseIntentionsDescriptor;
import jetbrains.mps.intentions.IntentionsManager;

public class IntentionsDescriptor extends BaseIntentionsDescriptor {
  public void init() {
    IntentionsManager.getInstance().registerIntentionFactory(new ClearAll_Intention());
  }
}
