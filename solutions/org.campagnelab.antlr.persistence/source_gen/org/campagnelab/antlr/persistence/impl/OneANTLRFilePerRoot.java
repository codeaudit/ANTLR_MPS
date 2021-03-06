package org.campagnelab.antlr.persistence.impl;

/*Generated by MPS */

import jetbrains.mps.extapi.persistence.FolderDataSource;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.vfs.IFile;
import org.jetbrains.mps.openapi.persistence.ModelRoot;
import jetbrains.mps.util.FileUtil;

public class OneANTLRFilePerRoot extends FolderDataSource {

  public static final String HEADER_FILE = ".g4";
  public static final String ROOT_EXTENSION = ".g4";
  /**
   * @param modelRoot (optional) containing model root, which should be notified before the source during the update
   */
  public OneANTLRFilePerRoot(@NotNull IFile folder, ModelRoot modelRoot) {
    super(folder, modelRoot);
  }
  @Override
  public boolean isIncluded(IFile file) {
    return super.isIncluded(file) && isPerRootPersistenceFile(file);
  }
  public static boolean isPerRootPersistenceFile(IFile file) {
    String fileName = file.getName();
    if (HEADER_FILE.equals(fileName)) {
      return true;
    }
    String extension = FileUtil.getExtension(fileName);
    return ROOT_EXTENSION.equals(extension);
  }
  public static boolean isPerRootPersistenceFolder(IFile folder) {
    return folder.getDescendant(HEADER_FILE).exists();
  }

}
