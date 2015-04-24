<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:579fcb2d-4d1f-46c6-93f9-98775dc55169(org.campagnelab.ANTLR.structure)">
  <persistence version="9" />
  <languages>
    <use id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure" version="-1" />
    <devkit ref="fbc25dd2-5da4-483a-8b19-70928e1b62d7(jetbrains.mps.devkit.general-purpose)" />
  </languages>
  <imports>
    <import index="tpck" ref="r:00000000-0000-4000-0000-011c89590288(jetbrains.mps.lang.core.structure)" implicit="true" />
  </imports>
  <registry>
    <language id="c72da2b9-7cce-4447-8389-f407dc1158b7" name="jetbrains.mps.lang.structure">
      <concept id="1169125787135" name="jetbrains.mps.lang.structure.structure.AbstractConceptDeclaration" flags="ig" index="PkWjJ">
        <property id="4628067390765956807" name="final" index="R5$K2" />
        <property id="4628067390765956802" name="abstract" index="R5$K7" />
        <property id="5092175715804935370" name="conceptAlias" index="34LRSv" />
        <child id="1071489727083" name="linkDeclaration" index="1TKVEi" />
        <child id="1071489727084" name="propertyDeclaration" index="1TKVEl" />
      </concept>
      <concept id="1169127622168" name="jetbrains.mps.lang.structure.structure.InterfaceConceptReference" flags="ig" index="PrWs8">
        <reference id="1169127628841" name="intfc" index="PrY4T" />
      </concept>
      <concept id="1071489090640" name="jetbrains.mps.lang.structure.structure.ConceptDeclaration" flags="ig" index="1TIwiD">
        <property id="1096454100552" name="rootable" index="19KtqR" />
        <reference id="1071489389519" name="extends" index="1TJDcQ" />
        <child id="1169129564478" name="implements" index="PzmwI" />
      </concept>
      <concept id="1071489288299" name="jetbrains.mps.lang.structure.structure.PropertyDeclaration" flags="ig" index="1TJgyi">
        <reference id="1082985295845" name="dataType" index="AX2Wp" />
      </concept>
      <concept id="1071489288298" name="jetbrains.mps.lang.structure.structure.LinkDeclaration" flags="ig" index="1TJgyj">
        <property id="1071599776563" name="role" index="20kJfa" />
        <property id="1071599893252" name="sourceCardinality" index="20lbJX" />
        <property id="1071599937831" name="metaClass" index="20lmBu" />
        <reference id="1071599976176" name="target" index="20lvS9" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
  </registry>
  <node concept="1TIwiD" id="6cuUYchcyaD">
    <property role="TrG5h" value="Grammar" />
    <property role="19KtqR" value="true" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="6cuUYchcHwV" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="rules" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="1tv9AyCx$yE" resolve="Rule" />
    </node>
    <node concept="PrWs8" id="6cuUYchcHw2" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYchcHwS">
    <property role="TrG5h" value="ParserRule" />
    <property role="34LRSv" value="parserRule" />
    <ref role="1TJDcQ" node="1tv9AyCx$yE" resolve="Rule" />
    <node concept="1TJgyj" id="6cuUYchcHx4" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="rhs" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    </node>
    <node concept="PrWs8" id="6cuUYchcHwT" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYchcHx2">
    <property role="TrG5h" value="Alternatives" />
    <ref role="1TJDcQ" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    <node concept="1TJgyj" id="6cuUYchcH_D" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="oneOf" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="6cuUYcheOmf" resolve="Alternative" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYchcHx3">
    <property role="TrG5h" value="ParserRuleBlock" />
    <property role="R5$K7" value="true" />
    <property role="R5$K2" value="false" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyi" id="6cuUYchf495" role="1TKVEl">
      <property role="TrG5h" value="isOptional" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="6cuUYchf497" role="1TKVEl">
      <property role="TrG5h" value="acceptMultiple" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
    <node concept="1TJgyi" id="7a2u8aS_VBl" role="1TKVEl">
      <property role="TrG5h" value="plus" />
      <ref role="AX2Wp" to="tpck:fKAQMTB" resolve="boolean" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYchcHx6">
    <property role="TrG5h" value="Sequence" />
    <ref role="1TJDcQ" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    <node concept="1TJgyj" id="6cuUYchcH_F" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="of" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYchcH_A">
    <property role="TrG5h" value="ParserRuleRef" />
    <ref role="1TJDcQ" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    <node concept="1TJgyj" id="6cuUYchcH_B" role="1TKVEi">
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="rule" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="6cuUYchcHwS" resolve="ParserRule" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYcheOmf">
    <property role="TrG5h" value="Alternative" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="6cuUYcheOmg" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="rhs" />
      <ref role="20lvS9" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYchfAlw">
    <property role="TrG5h" value="LexerToken" />
    <property role="R5$K7" value="true" />
    <property role="R5$K2" value="false" />
    <ref role="1TJDcQ" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
  </node>
  <node concept="1TIwiD" id="6cuUYchfAlZ">
    <property role="TrG5h" value="StringLiteral" />
    <property role="34LRSv" value="'" />
    <ref role="1TJDcQ" node="6cuUYchfAlw" resolve="LexerToken" />
    <node concept="1TJgyi" id="6cuUYchfAm0" role="1TKVEl">
      <property role="TrG5h" value="literal" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="6cuUYchfEkV">
    <property role="TrG5h" value="REGEXP" />
    <property role="34LRSv" value="[" />
    <ref role="1TJDcQ" node="6cuUYchfAlw" resolve="LexerToken" />
    <node concept="1TJgyi" id="6cuUYchfEpT" role="1TKVEl">
      <property role="TrG5h" value="regexp" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="1UUTzwdTiBS">
    <property role="TrG5h" value="Parentheses" />
    <property role="34LRSv" value="(" />
    <ref role="1TJDcQ" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    <node concept="1TJgyj" id="1UUTzwdTiCf" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="content" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="6cuUYchcHx6" resolve="Sequence" />
    </node>
  </node>
  <node concept="1TIwiD" id="1UUTzwdTKPS">
    <property role="TrG5h" value="RuleRefByName" />
    <ref role="1TJDcQ" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
    <node concept="1TJgyi" id="1UUTzwdTKPT" role="1TKVEl">
      <property role="TrG5h" value="name" />
      <ref role="AX2Wp" to="tpck:fKAOsGN" resolve="string" />
    </node>
  </node>
  <node concept="1TIwiD" id="1tv9AyCw3fM">
    <property role="TrG5h" value="Dot" />
    <property role="34LRSv" value="." />
    <ref role="1TJDcQ" node="6cuUYchcHx3" resolve="ParserRuleBlock" />
  </node>
  <node concept="1TIwiD" id="1tv9AyCx$yE">
    <property role="TrG5h" value="Rule" />
    <property role="R5$K7" value="true" />
    <property role="R5$K2" value="false" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
  </node>
  <node concept="1TIwiD" id="1tv9AyCx$yL">
    <property role="TrG5h" value="LexerRule" />
    <property role="34LRSv" value="lexerRule" />
    <ref role="1TJDcQ" node="1tv9AyCx$yE" resolve="Rule" />
    <node concept="1TJgyj" id="1tv9AyCxELX" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="rhs" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="1tv9AyCxEM5" resolve="LexerRuleBlock" />
    </node>
    <node concept="PrWs8" id="1tv9AyCy7Xw" role="PzmwI">
      <ref role="PrY4T" to="tpck:h0TrEE$" resolve="INamedConcept" />
    </node>
  </node>
  <node concept="1TIwiD" id="1tv9AyCxEM5">
    <property role="TrG5h" value="LexerRuleBlock" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="1tv9AyCxEMA" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="alternatives" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="1tv9AyCxMoD" resolve="LexerAlternative" />
    </node>
  </node>
  <node concept="1TIwiD" id="1tv9AyCxMoD">
    <property role="TrG5h" value="LexerAlternative" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="1tv9AyCxMoE" role="1TKVEi">
      <property role="20lmBu" value="aggregation" />
      <property role="20kJfa" value="elements" />
      <property role="20lbJX" value="1..n" />
      <ref role="20lvS9" node="6cuUYcheOmf" resolve="Alternative" />
    </node>
  </node>
  <node concept="1TIwiD" id="1tv9AyC$eYu">
    <property role="TrG5h" value="LexerRuleRef" />
    <ref role="1TJDcQ" to="tpck:gw2VY9q" resolve="BaseConcept" />
    <node concept="1TJgyj" id="1tv9AyC$eYv" role="1TKVEi">
      <property role="20lmBu" value="reference" />
      <property role="20kJfa" value="rule" />
      <property role="20lbJX" value="1" />
      <ref role="20lvS9" node="1tv9AyCx$yL" resolve="LexerRule" />
    </node>
  </node>
</model>

