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
import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import jetbrains.mps.editor.runtime.style.StyleAttributes;

public class Destination_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createReadOnlyModelAccessor_tbkp6n_a(editorContext, node);
  }
  private EditorCell createReadOnlyModelAccessor_tbkp6n_a(final EditorContext editorContext, final SNode node) {
    EditorCell_Property editorCell = EditorCell_Property.create(editorContext, new ModelAccessor() {
      public String getText() {
        return BehaviorReflection.invokeVirtual(String.class, node, "virtual_name_2860118060023810449", new Object[]{});
      }
      public void setText(String s) {
      }
      public boolean isValidText(String s) {
        return EqualUtil.equals(s, getText());
      }
    }, node);
    editorCell.setAction(CellActionType.DELETE, EmptyCellAction.getInstance());
    editorCell.setAction(CellActionType.BACKSPACE, EmptyCellAction.getInstance());
    editorCell.setCellId("ReadOnlyModelAccessor_tbkp6n_a");
    editorCell.setBig(true);
    Style style = new StyleImpl();
    style.set(StyleAttributes.NAVIGATABLE_NODE, 0, Destination_Editor._StyleParameter_QueryFunction_tbkp6n_a0a((editorCell == null ? null : editorCell.getContext()), (editorCell == null ? null : editorCell.getSNode())));
    editorCell.getStyle().putAll(style);
    return editorCell;
  }
  private static SNode _StyleParameter_QueryFunction_tbkp6n_a0a(EditorContext editorContext, SNode node) {
    return BehaviorReflection.invokeVirtual((Class<SNode>) ((Class) Object.class), node, "virtual_to_1096804516885006638", new Object[]{});
  }
}
