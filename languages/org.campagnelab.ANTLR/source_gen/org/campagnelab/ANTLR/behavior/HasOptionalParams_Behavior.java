package org.campagnelab.ANTLR.behavior;

/*Generated by MPS */

import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class HasOptionalParams_Behavior {
  public static void init(SNode thisNode) {
  }
  public static String virtual_toText_5668935624399900127(SNode thisNode) {
    return ((SPropertyOperations.getBoolean(thisNode, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517bbd3L, "acceptMultiple")) ? "*" : "")) + ((SPropertyOperations.getBoolean(thisNode, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517b02cL, "isOptional")) ? "?" : "")) + ((SPropertyOperations.getBoolean(thisNode, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517bcdaL, "plus")) ? "+" : ""));
  }
  public static void call_setParams_5496686145712410299(SNode thisNode, SNode optionalParams) {
    SPropertyOperations.set(thisNode, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517bbd3L, "acceptMultiple"), "" + (SPropertyOperations.getBoolean(optionalParams, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517bbd3L, "acceptMultiple"))));
    SPropertyOperations.set(thisNode, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517b02cL, "isOptional"), "" + (SPropertyOperations.getBoolean(optionalParams, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517b02cL, "isOptional"))));
    SPropertyOperations.set(thisNode, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517bcdaL, "plus"), "" + (SPropertyOperations.getBoolean(optionalParams, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x797c10c6e517ac38L, 0x797c10c6e517bcdaL, "plus"))));
  }
}
