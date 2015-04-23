package org.campagnelab.ANTLR.editor;

/*Generated by MPS */

import jetbrains.mps.editor.runtime.cells.KeyMapImpl;
import jetbrains.mps.openapi.editor.cells.KeyMapAction;
import jetbrains.mps.editor.runtime.cells.KeyMapActionImpl;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import org.jetbrains.mps.openapi.model.SNodeUtil;
import org.jetbrains.mps.openapi.language.SConceptRepository;
import java.util.List;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SPropertyOperations;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class MultiplicityKeyMap extends KeyMapImpl {
  public MultiplicityKeyMap() {
    this.setApplicableToEveryModel(true);
    KeyMapAction action;
    action = new MultiplicityKeyMap.MultiplicityKeyMap_Action0();
    this.putAction("none", "?", action);
    action = new MultiplicityKeyMap.MultiplicityKeyMap_Action1();
    this.putAction("any", "+", action);
  }
  public static class MultiplicityKeyMap_Action0 extends KeyMapActionImpl {
    public MultiplicityKeyMap_Action0() {
      this.setShownInPopupMenu(true);
    }
    public String getDescriptionText() {
      return "Set ? Optional";
    }
    public boolean isMenuAlwaysShown() {
      return false;
    }
    public boolean canExecute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (!(SNodeUtil.isInstanceOf(contextNode, SConceptRepository.getInstance().getConcept("org.campagnelab.ANTLR.structure.RuleRHS")))) {
        return false;
      }
      return this.canExecute_internal(editorContext, contextNode, this.getSelectedNodes(editorContext));
    }
    public void execute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }
    private boolean canExecute_internal(final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return !(SPropertyOperations.getBoolean(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4245L, "isOptional")));
    }
    private void execute_internal(final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4245L, "isOptional"), "" + (true));
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4247L, "acceptMultiple"), "" + (false));
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x72827882b897b9d5L, "plus"), "" + (false));

    }
    public String getKeyStroke() {
      return "none ?";
    }
  }
  public static class MultiplicityKeyMap_Action1 extends KeyMapActionImpl {
    public MultiplicityKeyMap_Action1() {
      this.setShownInPopupMenu(true);
    }
    public boolean isMenuAlwaysShown() {
      return false;
    }
    public boolean canExecute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      if ((contextCell == null)) {
        return false;
      }
      SNode contextNode = contextCell.getSNode();
      if (contextNode == null) {
        return false;
      }
      if (!(SNodeUtil.isInstanceOf(contextNode, SConceptRepository.getInstance().getConcept("org.campagnelab.ANTLR.structure.RuleRHS")))) {
        return false;
      }
      return this.canExecute_internal(editorContext, contextNode, this.getSelectedNodes(editorContext));
    }
    public void execute(final EditorContext editorContext) {
      EditorCell contextCell = editorContext.getContextCell();
      this.execute_internal(editorContext, contextCell.getSNode(), this.getSelectedNodes(editorContext));
    }
    private boolean canExecute_internal(final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      return SPropertyOperations.getBoolean(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x72827882b897b9d5L, "plus")) == false;
    }
    private void execute_internal(final EditorContext editorContext, final SNode node, final List<SNode> selectedNodes) {
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x72827882b897b9d5L, "plus"), "" + (true));
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4247L, "acceptMultiple"), "" + (false));
      SPropertyOperations.set(node, MetaAdapterFactory.getProperty(0xd6782141eafa4cf7L, 0xa85d1229abdb1152L, 0x631eebe31132d843L, 0x631eebe3113c4245L, "isOptional"), "" + (false));
    }
    public String getKeyStroke() {
      return " +";
    }
  }
}
