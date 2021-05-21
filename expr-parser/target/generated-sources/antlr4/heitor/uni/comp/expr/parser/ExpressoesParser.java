// Generated from heitor\u005Cuni\comp\expr\parser\Expressoes.g4 by ANTLR 4.7.2
package heitor.uni.comp.expr.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ExpressoesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NUM=6, WS=7;
	public static final int
		RULE_programa = 0, RULE_expressao = 1, RULE_expressao2 = 2, RULE_termo = 3, 
		RULE_termo2 = 4, RULE_fator = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "expressao", "expressao2", "termo", "termo2", "fator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Expressoes.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ExpressoesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramaContext extends ParserRuleContext {
		public int val;
		public ExpressaoContext expressao;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ExpressoesParser.EOF, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitPrograma(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(12);
			((ProgramaContext)_localctx).expressao = expressao();
			setState(13);
			match(EOF);
			 ((ProgramaContext)_localctx).val =  ((ProgramaContext)_localctx).expressao.val; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressaoContext extends ParserRuleContext {
		public int val;
		public TermoContext termo;
		public Expressao2Context expressao2;
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Expressao2Context expressao2() {
			return getRuleContext(Expressao2Context.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			((ExpressaoContext)_localctx).termo = termo();
			setState(17);
			((ExpressaoContext)_localctx).expressao2 = expressao2(((ExpressaoContext)_localctx).termo.val);
			 ((ExpressaoContext)_localctx).val =  ((ExpressaoContext)_localctx).expressao2.sint; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao2Context extends ParserRuleContext {
		public int her;
		public int sint;
		public TermoContext termo;
		public Expressao2Context exp;
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public Expressao2Context expressao2() {
			return getRuleContext(Expressao2Context.class,0);
		}
		public Expressao2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Expressao2Context(ParserRuleContext parent, int invokingState, int her) {
			super(parent, invokingState);
			this.her = her;
		}
		@Override public int getRuleIndex() { return RULE_expressao2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterExpressao2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitExpressao2(this);
		}
	}

	public final Expressao2Context expressao2(int her) throws RecognitionException {
		Expressao2Context _localctx = new Expressao2Context(_ctx, getState(), her);
		enterRule(_localctx, 4, RULE_expressao2);
		try {
			setState(31);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(20);
				match(T__0);
				setState(21);
				((Expressao2Context)_localctx).termo = termo();
				setState(22);
				((Expressao2Context)_localctx).exp = expressao2(((Expressao2Context)_localctx).termo.val+_localctx.her);
				 ((Expressao2Context)_localctx).sint =  ((Expressao2Context)_localctx).exp.sint; 
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(25);
				match(T__1);
				setState(26);
				((Expressao2Context)_localctx).termo = termo();
				setState(27);
				((Expressao2Context)_localctx).exp = expressao2(_localctx.her-((Expressao2Context)_localctx).termo.val);
				 ((Expressao2Context)_localctx).sint =  ((Expressao2Context)_localctx).exp.sint; 
				}
				break;
			case EOF:
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				 ((Expressao2Context)_localctx).sint =  _localctx.her; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermoContext extends ParserRuleContext {
		public int val;
		public FatorContext fator;
		public Termo2Context termo2;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Termo2Context termo2() {
			return getRuleContext(Termo2Context.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			((TermoContext)_localctx).fator = fator();
			setState(34);
			((TermoContext)_localctx).termo2 = termo2(((TermoContext)_localctx).fator.val);
			 ((TermoContext)_localctx).val =  ((TermoContext)_localctx).termo2.sint; 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Termo2Context extends ParserRuleContext {
		public int her;
		public int sint;
		public FatorContext fator;
		public Termo2Context term;
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public Termo2Context termo2() {
			return getRuleContext(Termo2Context.class,0);
		}
		public Termo2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Termo2Context(ParserRuleContext parent, int invokingState, int her) {
			super(parent, invokingState);
			this.her = her;
		}
		@Override public int getRuleIndex() { return RULE_termo2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterTermo2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitTermo2(this);
		}
	}

	public final Termo2Context termo2(int her) throws RecognitionException {
		Termo2Context _localctx = new Termo2Context(_ctx, getState(), her);
		enterRule(_localctx, 8, RULE_termo2);
		try {
			setState(43);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				match(T__2);
				setState(38);
				((Termo2Context)_localctx).fator = fator();
				setState(39);
				((Termo2Context)_localctx).term = termo2(((Termo2Context)_localctx).fator.val*_localctx.her);
				 ((Termo2Context)_localctx).sint =  ((Termo2Context)_localctx).term.sint; 
				}
				break;
			case EOF:
			case T__0:
			case T__1:
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				 ((Termo2Context)_localctx).sint =  _localctx.her; 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FatorContext extends ParserRuleContext {
		public int val;
		public ExpressaoContext expressao;
		public Token NUM;
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public TerminalNode NUM() { return getToken(ExpressoesParser.NUM, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof ExpressoesListener ) ((ExpressoesListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fator);
		try {
			setState(52);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				match(T__3);
				setState(46);
				((FatorContext)_localctx).expressao = expressao();
				setState(47);
				match(T__4);
				 ((FatorContext)_localctx).val =  ((FatorContext)_localctx).expressao.val; 
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				((FatorContext)_localctx).NUM = match(NUM);
				 ((FatorContext)_localctx).val =  Integer.parseInt(((FatorContext)_localctx).NUM.getText()); 
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\"\n\4\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\5\6.\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\67\n\7\3"+
		"\7\2\2\b\2\4\6\b\n\f\2\2\2\66\2\16\3\2\2\2\4\22\3\2\2\2\6!\3\2\2\2\b#"+
		"\3\2\2\2\n-\3\2\2\2\f\66\3\2\2\2\16\17\5\4\3\2\17\20\7\2\2\3\20\21\b\2"+
		"\1\2\21\3\3\2\2\2\22\23\5\b\5\2\23\24\5\6\4\2\24\25\b\3\1\2\25\5\3\2\2"+
		"\2\26\27\7\3\2\2\27\30\5\b\5\2\30\31\5\6\4\2\31\32\b\4\1\2\32\"\3\2\2"+
		"\2\33\34\7\4\2\2\34\35\5\b\5\2\35\36\5\6\4\2\36\37\b\4\1\2\37\"\3\2\2"+
		"\2 \"\b\4\1\2!\26\3\2\2\2!\33\3\2\2\2! \3\2\2\2\"\7\3\2\2\2#$\5\f\7\2"+
		"$%\5\n\6\2%&\b\5\1\2&\t\3\2\2\2\'(\7\5\2\2()\5\f\7\2)*\5\n\6\2*+\b\6\1"+
		"\2+.\3\2\2\2,.\b\6\1\2-\'\3\2\2\2-,\3\2\2\2.\13\3\2\2\2/\60\7\6\2\2\60"+
		"\61\5\4\3\2\61\62\7\7\2\2\62\63\b\7\1\2\63\67\3\2\2\2\64\65\7\b\2\2\65"+
		"\67\b\7\1\2\66/\3\2\2\2\66\64\3\2\2\2\67\r\3\2\2\2\5!-\66";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}