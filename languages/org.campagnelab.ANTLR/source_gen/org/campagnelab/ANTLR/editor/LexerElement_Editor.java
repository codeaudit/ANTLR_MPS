package org.campagnelab.ANTLR.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.DefaultNodeEditor;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import jetbrains.mps.openapi.editor.EditorContext;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.nodeEditor.cells.EditorCell_Collection;

public class LexerElement_Editor extends DefaultNodeEditor {
  public EditorCell createEditorCell(EditorContext editorContext, SNode node) {
    return this.createCollection_mg8eu6_a(editorContext, node);
  }
  private EditorCell createCollection_mg8eu6_a(EditorContext editorContext, SNode node) {
    EditorCell_Collection editorCell = EditorCell_Collection.createIndent2(editorContext, node);
    editorCell.setCellId("Collection_mg8eu6_a");
    editorCell.setBig(true);
    editorCell.addEditorCell(this.createComponent_mg8eu6_a0(editorContext, node));
    return editorCell;
  }
  private EditorCell createComponent_mg8eu6_a0(EditorContext editorContext, SNode node) {
    EditorCell editorCell = editorContext.getCellFactory().createEditorComponentCell(node, "org.campagnelab.ANTLR.editor.OptionalParamEditor");
    return editorCell;
  }
}