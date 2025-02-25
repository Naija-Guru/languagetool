package org.languagetool.rules.pcm;

import org.junit.Test;
import org.languagetool.rules.patterns.PatternRuleTest;

import java.io.IOException;

public class NaijaPatternRuleTest extends PatternRuleTest {
  @Test
  public void testRules() throws IOException {
    runGrammarRulesFromXmlTest();
  }
}
