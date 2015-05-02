package org.campagnelab.antlr.tomps.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Property;
import jetbrains.mps.nodeEditor.cells.ModelAccessor;
import jetbrains.mps.smodel.behaviour.BehaviorReflection;
import jetbrains.mps.util.EqualUtil;
import jetbrains.mps.openapi.editor.cells.CellActionType;
import jetbrains.mps.editor.runtime.cells.EmptyCellAction;

public class Source_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createReadOnlyModelAccessor_x58f0o_a(editorContext, node);
  }
  private EditorCell createReadOnlyModelAccessor_x58f0o_a(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        return BehaviorReflection.invokeVirtual(String.class, node, "virtual_name_4068410015138152876", new Object[]{});
      }
      public void setText(String s) {
      }
      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_x58f0o_a");
    editorCell.setBig(true);
    return editorCell;
  }
}
