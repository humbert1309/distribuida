/* The following code was generated by JFlex 1.4.3 on 17/11/15 09:30 AM */

package Analiza;
import static Analiza.Token.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 17/11/15 09:30 AM from the specification file
 * <tt>C:/Users/Nadhyeli/Desktop/Analizador Lexico/src/analizador/Lexer.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\3\2\0\1\3\22\0\1\11\6\0\1\24\1\30"+
    "\1\30\1\12\1\0\1\20\1\0\1\25\1\0\12\2\1\0\1\17"+
    "\1\0\1\23\3\0\32\1\4\0\1\1\1\0\1\32\1\1\1\7"+
    "\1\34\1\5\1\13\1\1\1\22\1\26\2\1\1\6\1\16\1\27"+
    "\1\15\1\35\1\1\1\14\1\4\1\10\1\33\1\31\1\21\3\1"+
    "\uff85\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\4\1\170\0\1\3\17\0\1\4"+
    "\10\0\1\5\110\0\1\6\31\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[251];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\36\0\74\0\132\0\170\0\226\0\264"+
    "\0\322\0\360\0\u010e\0\u012c\0\u014a\0\u0168\0\u0186\0\u01a4"+
    "\0\u01c2\0\u01e0\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276\0\u0294"+
    "\0\u02b2\0\u02d0\0\u02ee\0\74\0\u030c\0\u032a\0\u0348\0\132"+
    "\0\u0366\0\170\0\u0384\0\226\0\u03a2\0\u03c0\0\u03de\0\u03fc"+
    "\0\u041a\0\u0438\0\u0456\0\u0474\0\u0492\0\u04b0\0\u04ce\0\u04ec"+
    "\0\u050a\0\u0528\0\u0546\0\u0564\0\u0582\0\u05a0\0\u05be\0\u05dc"+
    "\0\u05fa\0\u0618\0\u0636\0\u0654\0\u0672\0\u0690\0\u06ae\0\u06cc"+
    "\0\u06ea\0\u0708\0\u0726\0\u0744\0\u0762\0\u0780\0\u079e\0\u07bc"+
    "\0\u07da\0\u07f8\0\u0816\0\u0834\0\u0852\0\u0870\0\u088e\0\u08ac"+
    "\0\u08ca\0\u08e8\0\u0906\0\u0924\0\u0942\0\u0960\0\u097e\0\u099c"+
    "\0\u09ba\0\u09d8\0\u09f6\0\u0a14\0\u0a32\0\u0a50\0\u0a6e\0\u0a8c"+
    "\0\u0aaa\0\u0ac8\0\u0ae6\0\u0b04\0\u0b22\0\u0b40\0\u0b5e\0\u0b7c"+
    "\0\u0b9a\0\u0bb8\0\u0bd6\0\u0bf4\0\u0c12\0\u0c30\0\u0c4e\0\u0c6c"+
    "\0\u0c8a\0\u0ca8\0\u0cc6\0\u0ce4\0\u0d02\0\u0d20\0\u0d3e\0\u0d5c"+
    "\0\u0d7a\0\u0d98\0\u0db6\0\u0dd4\0\u0df2\0\u0e10\0\u0e2e\0\36"+
    "\0\u0e4c\0\u0e6a\0\u0e88\0\u0ea6\0\u0ec4\0\u0ee2\0\u0f00\0\u0f1e"+
    "\0\u0f3c\0\u0f5a\0\u0f78\0\u0f96\0\u0fb4\0\u0fd2\0\u0ff0\0\36"+
    "\0\u100e\0\u102c\0\u104a\0\u1068\0\u1086\0\u10a4\0\u10c2\0\u10e0"+
    "\0\36\0\u10fe\0\u111c\0\u113a\0\u1158\0\u1176\0\u1194\0\u11b2"+
    "\0\u11d0\0\u11ee\0\u120c\0\u122a\0\u1248\0\u1266\0\u1284\0\u12a2"+
    "\0\u12c0\0\u12de\0\u12fc\0\u131a\0\u1338\0\u1356\0\u1374\0\u1392"+
    "\0\u13b0\0\u13ce\0\u13ec\0\u140a\0\u1428\0\u1446\0\u1464\0\u1482"+
    "\0\u14a0\0\u14be\0\u14dc\0\u14fa\0\u1518\0\u1536\0\u1554\0\u1572"+
    "\0\u1590\0\u15ae\0\u15cc\0\u15ea\0\u1608\0\u1626\0\u1644\0\u1662"+
    "\0\u1680\0\u169e\0\u16bc\0\u16da\0\u16f8\0\u1716\0\u1734\0\u1752"+
    "\0\u1770\0\u178e\0\u17ac\0\u17ca\0\u17e8\0\u1806\0\u1824\0\u1842"+
    "\0\u1860\0\u187e\0\u189c\0\u18ba\0\u18d8\0\u18f6\0\u1914\0\u1932"+
    "\0\u1950\0\36\0\u196e\0\u198c\0\u19aa\0\u19c8\0\u19e6\0\u1a04"+
    "\0\u1a22\0\u1a40\0\u1a5e\0\u1a7c\0\u1a9a\0\u1ab8\0\u1ad6\0\u1af4"+
    "\0\u1b12\0\u1b30\0\u1b4e\0\u1b6c\0\u1b8a\0\u1ba8\0\u1bc6\0\u1be4"+
    "\0\u1c02\0\u1c20\0\u1c3e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[251];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\2\1\3\1\4\4\2\1\3\14\2\1\5\4\2"+
    "\1\6\1\7\1\2\43\0\1\10\57\0\1\11\43\0"+
    "\1\12\5\0\1\13\36\0\1\14\33\0\1\15\65\0"+
    "\1\16\7\0\1\17\34\0\1\20\35\0\1\21\62\0"+
    "\1\22\10\0\1\23\37\0\1\24\42\0\1\25\31\0"+
    "\1\26\35\0\1\27\35\0\1\30\35\0\1\31\32\0"+
    "\1\32\35\0\1\33\34\0\1\34\4\0\1\35\1\36"+
    "\34\0\1\37\14\0\1\40\20\0\1\41\21\0\1\42"+
    "\13\0\1\43\22\0\1\44\2\0\1\45\2\0\5\45"+
    "\1\35\1\46\4\45\2\0\2\45\3\0\2\45\1\0"+
    "\5\45\11\0\1\47\1\36\34\0\1\37\14\0\1\50"+
    "\10\0\1\51\2\0\5\51\1\52\1\0\4\51\2\0"+
    "\2\51\3\0\2\51\1\0\5\51\1\0\1\53\2\0"+
    "\5\53\1\54\1\0\1\55\3\53\2\0\2\53\3\0"+
    "\2\53\1\0\5\53\1\0\1\45\2\0\5\45\1\56"+
    "\1\57\4\45\1\0\1\60\2\45\3\0\2\45\1\0"+
    "\5\45\1\0\1\61\2\0\5\61\1\62\1\46\4\61"+
    "\2\0\2\61\3\0\2\61\1\0\5\61\11\0\1\47"+
    "\1\0\1\63\51\0\1\64\7\0\1\51\2\0\5\51"+
    "\1\65\1\0\4\51\1\0\1\66\2\51\3\0\2\51"+
    "\1\0\5\51\1\0\1\51\2\0\1\67\4\51\1\52"+
    "\1\0\4\51\2\0\2\51\3\0\2\51\1\0\5\51"+
    "\1\0\1\53\2\0\5\53\1\70\1\0\4\53\1\0"+
    "\1\71\2\53\3\0\2\53\1\0\5\53\1\0\1\53"+
    "\2\0\5\53\1\54\1\0\1\72\3\53\2\0\2\53"+
    "\3\0\2\53\1\0\5\53\1\0\1\53\2\0\5\53"+
    "\1\70\1\0\1\53\1\73\2\53\1\0\1\71\2\53"+
    "\3\0\2\53\1\0\5\53\11\0\1\56\1\0\1\74"+
    "\23\0\1\61\2\0\5\61\1\75\1\57\4\61\2\0"+
    "\2\61\3\0\2\61\1\0\5\61\1\0\1\76\2\0"+
    "\5\76\2\0\4\76\1\0\1\60\2\76\3\0\2\76"+
    "\1\0\5\76\1\0\1\61\2\0\5\61\1\75\1\57"+
    "\4\61\1\0\1\77\2\61\3\0\2\61\1\0\5\61"+
    "\11\0\1\62\1\0\1\100\36\0\1\101\31\0\1\102"+
    "\31\0\1\103\4\0\1\65\25\0\1\104\2\0\5\104"+
    "\2\0\4\104\1\0\1\66\2\104\3\0\2\104\1\0"+
    "\5\104\1\0\1\51\2\0\1\51\1\105\3\51\1\65"+
    "\1\0\4\51\1\0\1\66\2\51\3\0\2\51\1\0"+
    "\5\51\11\0\1\70\1\0\1\106\23\0\1\107\2\0"+
    "\5\107\2\0\4\107\1\0\1\71\2\107\3\0\2\107"+
    "\1\0\5\107\1\0\1\53\2\0\5\53\1\70\1\0"+
    "\1\53\1\110\2\53\1\0\1\71\2\53\3\0\2\53"+
    "\1\0\5\53\1\0\1\53\2\0\5\53\1\70\1\0"+
    "\2\53\1\111\1\53\1\0\1\71\2\53\3\0\2\53"+
    "\1\0\5\53\14\0\1\112\32\0\1\75\1\0\1\113"+
    "\23\0\1\45\2\0\5\45\1\56\1\57\4\45\2\0"+
    "\2\45\3\0\2\45\1\0\5\45\1\0\1\57\2\0"+
    "\5\57\2\0\4\57\1\0\1\77\2\57\3\0\2\57"+
    "\1\0\5\57\14\0\1\114\36\0\1\115\35\0\1\116"+
    "\25\0\1\117\31\0\1\120\2\0\5\120\1\121\1\0"+
    "\4\120\2\0\2\120\3\0\2\120\1\0\5\120\1\0"+
    "\1\51\2\0\4\51\1\122\1\65\1\0\4\51\1\0"+
    "\1\66\2\51\3\0\2\51\1\0\5\51\14\0\1\123"+
    "\22\0\1\53\2\0\5\53\1\70\1\0\4\53\2\0"+
    "\2\53\3\0\2\53\1\0\5\53\1\0\1\53\2\0"+
    "\5\53\1\70\1\0\2\53\1\124\1\53\1\0\1\71"+
    "\2\53\3\0\2\53\1\0\5\53\1\0\1\53\2\0"+
    "\5\53\1\70\1\0\3\53\1\125\1\0\1\71\2\53"+
    "\3\0\2\53\1\0\5\53\15\0\1\126\34\0\1\127"+
    "\36\0\1\130\36\0\1\131\30\0\1\132\14\0\1\50"+
    "\17\0\1\133\26\0\1\120\2\0\5\120\1\121\1\0"+
    "\4\120\1\0\1\66\2\120\3\0\2\120\1\0\5\120"+
    "\4\0\1\134\4\0\1\121\25\0\1\51\2\0\1\67"+
    "\4\51\1\135\1\0\4\51\1\0\1\66\2\51\3\0"+
    "\2\51\1\0\5\51\15\0\1\136\21\0\1\53\2\0"+
    "\5\53\1\70\1\0\3\53\1\137\1\0\1\71\2\53"+
    "\3\0\2\53\1\0\5\53\1\0\1\53\2\0\5\53"+
    "\1\140\1\0\1\55\3\53\1\0\1\71\2\53\3\0"+
    "\2\53\1\0\5\53\16\0\1\141\34\0\1\142\36\0"+
    "\1\143\30\0\1\144\1\0\1\63\23\0\1\145\2\0"+
    "\5\145\1\132\1\0\4\145\2\0\2\145\3\0\2\145"+
    "\1\0\5\145\4\0\1\103\4\0\1\146\31\0\1\147"+
    "\31\0\1\150\2\0\1\151\4\150\1\135\1\0\4\150"+
    "\2\0\2\150\3\0\2\150\1\0\5\150\16\0\1\152"+
    "\20\0\1\53\2\0\5\53\1\153\1\0\1\72\3\53"+
    "\1\0\1\71\2\53\3\0\2\53\1\0\5\53\1\0"+
    "\1\154\2\0\5\154\1\140\1\0\1\155\3\154\2\0"+
    "\2\154\3\0\2\154\1\0\5\154\11\0\1\156\1\0"+
    "\1\74\40\0\1\157\30\0\1\160\1\0\1\100\23\0"+
    "\1\161\2\0\5\161\1\144\1\0\4\161\2\0\2\161"+
    "\3\0\2\161\1\0\5\161\1\0\1\145\2\0\5\145"+
    "\1\162\1\0\4\145\2\0\2\145\3\0\2\145\1\0"+
    "\5\145\1\0\1\150\2\0\5\150\1\146\1\0\4\150"+
    "\2\0\2\150\3\0\2\150\1\0\5\150\10\0\1\163"+
    "\26\0\1\150\2\0\5\150\2\0\4\150\2\0\2\150"+
    "\1\164\1\0\1\165\2\150\1\0\5\150\1\0\1\150"+
    "\2\0\1\150\1\166\3\150\2\0\4\150\2\0\2\150"+
    "\1\164\1\0\1\165\2\150\1\0\5\150\11\0\1\167"+
    "\1\0\1\106\23\0\1\170\2\0\5\170\1\153\1\0"+
    "\1\171\3\170\2\0\2\170\3\0\2\170\1\0\5\170"+
    "\1\0\1\154\2\0\5\154\1\172\1\0\4\154\2\0"+
    "\2\154\3\0\2\154\1\0\5\154\1\0\1\154\2\0"+
    "\5\154\1\172\1\0\1\154\1\173\2\154\2\0\2\154"+
    "\3\0\2\154\1\0\5\154\1\0\1\174\2\0\5\174"+
    "\1\156\1\0\4\174\2\0\2\174\3\0\2\174\1\0"+
    "\5\174\11\0\1\175\1\0\1\113\23\0\1\176\2\0"+
    "\5\176\1\160\1\0\4\176\2\0\2\176\3\0\2\176"+
    "\1\0\5\176\1\0\1\161\2\0\5\161\1\177\1\0"+
    "\4\161\1\200\1\0\2\161\3\0\2\161\1\0\5\161"+
    "\2\0\1\201\6\0\1\162\12\0\1\202\3\0\1\203"+
    "\1\204\10\0\1\134\4\0\1\205\26\0\1\206\20\0"+
    "\1\164\1\207\12\0\1\210\2\0\5\210\2\0\4\210"+
    "\2\0\2\210\2\0\1\165\2\210\1\0\5\210\1\0"+
    "\1\150\2\0\4\150\1\211\2\0\4\150\2\0\2\150"+
    "\1\164\1\0\1\165\2\150\1\0\5\150\1\0\1\212"+
    "\2\0\5\212\1\167\1\0\4\212\2\0\2\212\3\0"+
    "\2\212\1\0\5\212\1\0\1\170\2\0\5\170\1\172"+
    "\1\0\4\170\1\0\1\213\2\170\3\0\2\170\1\0"+
    "\5\170\1\0\1\170\2\0\5\170\1\172\1\0\1\170"+
    "\1\214\2\170\1\0\1\213\2\170\3\0\2\170\1\0"+
    "\5\170\11\0\1\172\7\0\1\215\15\0\1\154\2\0"+
    "\5\154\1\172\1\0\2\154\1\216\1\154\2\0\2\154"+
    "\3\0\2\154\1\0\5\154\1\0\1\174\2\0\5\174"+
    "\1\217\1\0\4\174\1\220\1\0\2\174\3\0\2\174"+
    "\1\0\5\174\1\0\1\221\2\0\5\221\1\175\1\0"+
    "\4\221\2\0\2\221\3\0\2\221\1\0\5\221\1\0"+
    "\1\176\2\0\5\176\1\222\1\0\4\176\1\200\1\223"+
    "\2\176\3\0\2\176\1\0\5\176\11\0\1\177\5\0"+
    "\1\200\20\0\1\201\6\0\1\224\6\0\1\203\3\0"+
    "\1\202\3\0\1\203\1\204\5\0\1\225\2\0\5\225"+
    "\2\0\4\225\2\0\2\225\1\0\1\202\1\0\2\225"+
    "\1\0\5\225\2\0\1\201\6\0\1\224\12\0\1\202"+
    "\3\0\1\203\1\204\36\0\1\226\4\0\1\227\2\0"+
    "\5\227\1\205\1\0\4\227\2\0\2\227\3\0\2\227"+
    "\1\0\5\227\2\0\1\206\6\0\1\230\5\0\1\231"+
    "\4\0\1\207\12\0\1\232\2\0\5\232\2\0\4\232"+
    "\2\0\2\232\1\0\1\207\1\0\2\232\1\0\5\232"+
    "\1\0\1\210\2\0\5\210\2\0\4\210\2\0\2\210"+
    "\1\233\2\0\2\210\1\0\5\210\1\0\1\150\2\0"+
    "\1\151\4\150\1\146\1\0\4\150\2\0\2\150\1\164"+
    "\1\0\1\165\2\150\1\0\5\150\1\0\1\212\2\0"+
    "\5\212\2\0\4\212\1\0\1\213\2\212\3\0\2\212"+
    "\1\0\5\212\1\0\1\234\2\0\5\234\2\0\4\234"+
    "\1\0\1\213\2\234\3\0\2\234\1\0\5\234\1\0"+
    "\1\170\2\0\5\170\1\172\1\0\2\170\1\235\1\170"+
    "\1\0\1\213\2\170\3\0\2\170\1\0\5\170\22\0"+
    "\1\236\14\0\1\154\2\0\5\154\1\172\1\0\3\154"+
    "\1\237\2\0\2\154\3\0\2\154\1\0\5\154\11\0"+
    "\1\217\5\0\1\220\1\0\1\240\15\0\1\221\2\0"+
    "\5\221\1\241\1\0\4\221\2\0\2\221\3\0\2\221"+
    "\1\0\5\221\11\0\1\222\5\0\1\200\1\0\1\240"+
    "\15\0\1\242\2\0\5\242\2\0\4\242\1\0\1\223"+
    "\2\242\3\0\2\242\1\0\5\242\11\0\1\224\17\0"+
    "\1\204\5\0\1\225\2\0\5\225\2\0\4\225\2\0"+
    "\2\225\1\0\1\243\1\0\2\225\1\0\5\225\6\0"+
    "\1\244\30\0\1\227\2\0\5\227\2\0\4\227\2\0"+
    "\2\227\2\0\1\165\2\227\1\0\5\227\11\0\1\230"+
    "\5\0\1\231\17\0\1\232\2\0\5\232\2\0\4\232"+
    "\2\0\2\232\1\0\1\206\1\0\2\232\1\0\5\232"+
    "\1\0\1\245\2\0\5\245\2\0\4\245\2\0\2\245"+
    "\1\233\2\0\2\245\1\0\5\245\1\0\1\246\2\0"+
    "\5\246\1\247\1\0\4\246\2\0\2\246\3\0\2\246"+
    "\1\0\5\246\1\0\1\170\2\0\5\170\1\172\1\0"+
    "\3\170\1\250\1\0\1\213\2\170\3\0\2\170\1\0"+
    "\5\170\5\0\1\251\31\0\1\154\2\0\5\154\1\252"+
    "\1\0\1\155\3\154\2\0\2\154\3\0\2\154\1\0"+
    "\5\154\22\0\1\253\24\0\1\241\7\0\1\240\15\0"+
    "\1\254\2\0\5\254\1\255\1\0\4\254\2\0\2\254"+
    "\3\0\2\254\1\0\5\254\2\0\1\201\6\0\1\224"+
    "\6\0\1\203\3\0\1\256\3\0\1\203\1\204\37\0"+
    "\1\257\3\0\1\245\2\0\5\245\2\0\4\245\2\0"+
    "\2\245\2\0\1\260\2\245\1\0\5\245\1\0\1\246"+
    "\2\0\5\246\1\247\1\0\4\246\1\0\1\213\2\246"+
    "\3\0\2\246\1\0\5\246\11\0\1\247\7\0\1\261"+
    "\15\0\1\170\2\0\5\170\1\252\1\0\1\171\3\170"+
    "\1\0\1\213\2\170\3\0\2\170\1\0\5\170\14\0"+
    "\1\262\22\0\1\212\2\0\5\212\1\252\1\0\4\212"+
    "\2\0\1\263\1\212\3\0\2\212\1\0\5\212\5\0"+
    "\1\264\31\0\1\254\2\0\5\254\1\255\1\0\4\254"+
    "\1\0\1\223\2\254\3\0\2\254\1\0\5\254\11\0"+
    "\1\255\7\0\1\265\15\0\1\225\2\0\5\225\2\0"+
    "\4\225\1\0\1\203\2\225\1\0\1\256\1\0\2\225"+
    "\1\0\5\225\5\0\1\266\31\0\1\267\2\0\5\267"+
    "\2\0\4\267\2\0\2\267\2\0\1\260\2\267\1\0"+
    "\5\267\22\0\1\270\20\0\1\271\31\0\1\212\2\0"+
    "\5\212\2\0\4\212\1\0\1\213\1\212\1\272\3\0"+
    "\2\212\1\0\5\212\14\0\1\273\43\0\1\274\17\0"+
    "\1\275\32\0\1\267\2\0\5\267\1\276\1\0\4\267"+
    "\2\0\2\267\3\0\2\267\1\0\5\267\5\0\1\277"+
    "\41\0\1\300\7\0\1\215\15\0\1\212\2\0\1\212"+
    "\1\301\3\212\2\0\4\212\1\0\1\213\2\212\3\0"+
    "\2\212\1\0\5\212\5\0\1\302\35\0\1\303\32\0"+
    "\1\304\6\0\1\305\12\0\1\306\3\0\1\307\1\204"+
    "\15\0\1\276\7\0\1\310\30\0\1\311\22\0\1\312"+
    "\2\0\5\312\1\300\1\0\4\312\2\0\2\312\3\0"+
    "\2\312\1\0\5\312\1\0\1\212\2\0\5\212\2\0"+
    "\1\212\1\313\2\212\1\0\1\213\2\212\3\0\2\212"+
    "\1\0\5\212\21\0\1\240\1\0\1\314\26\0\1\315"+
    "\23\0\1\304\6\0\1\177\5\0\1\200\1\307\3\0"+
    "\1\306\3\0\1\307\7\0\1\304\6\0\1\305\12\0"+
    "\1\306\3\0\1\307\6\0\1\316\2\0\5\316\2\0"+
    "\4\316\2\0\2\316\1\0\1\306\1\0\2\316\1\0"+
    "\5\316\2\0\1\304\6\0\1\177\5\0\1\200\4\0"+
    "\1\306\3\0\1\307\27\0\1\317\20\0\1\320\31\0"+
    "\1\312\2\0\5\312\2\0\4\312\2\0\2\312\1\321"+
    "\2\0\2\312\1\0\5\312\1\0\1\212\2\0\1\212"+
    "\1\322\3\212\2\0\4\212\1\0\1\213\2\212\3\0"+
    "\2\212\1\0\5\212\2\0\1\323\20\0\1\314\1\324"+
    "\16\0\1\325\31\0\1\316\2\0\5\316\2\0\4\316"+
    "\2\0\2\316\1\0\1\326\1\0\2\316\1\0\5\316"+
    "\5\0\1\327\41\0\1\330\7\0\1\261\16\0\1\331"+
    "\20\0\1\321\1\332\12\0\1\212\2\0\5\212\1\300"+
    "\1\0\4\212\1\0\1\213\1\263\1\212\3\0\2\212"+
    "\1\0\5\212\2\0\1\323\6\0\1\333\5\0\1\220"+
    "\4\0\1\324\12\0\1\334\2\0\5\334\2\0\4\334"+
    "\2\0\2\334\1\0\1\324\1\0\2\334\1\0\5\334"+
    "\11\0\1\335\7\0\1\265\16\0\1\304\6\0\1\177"+
    "\5\0\1\200\1\307\3\0\1\336\3\0\1\307\21\0"+
    "\1\337\22\0\1\340\2\0\5\340\1\330\1\0\4\340"+
    "\2\0\2\340\3\0\2\340\1\0\5\340\2\0\1\331"+
    "\6\0\1\341\5\0\1\342\4\0\1\332\12\0\1\343"+
    "\2\0\5\343\2\0\4\343\2\0\2\343\1\0\1\332"+
    "\1\0\2\343\1\0\5\343\11\0\1\333\5\0\1\220"+
    "\17\0\1\334\2\0\5\334\2\0\4\334\2\0\2\334"+
    "\1\0\1\323\1\0\2\334\1\0\5\334\1\0\1\344"+
    "\2\0\5\344\1\335\1\0\4\344\2\0\2\344\3\0"+
    "\2\344\1\0\5\344\1\0\1\316\2\0\5\316\2\0"+
    "\4\316\1\0\1\307\2\316\1\0\1\336\1\0\2\316"+
    "\1\0\5\316\5\0\1\345\31\0\1\340\2\0\5\340"+
    "\2\0\4\340\2\0\2\340\2\0\1\346\2\340\1\0"+
    "\5\340\11\0\1\341\5\0\1\342\17\0\1\343\2\0"+
    "\5\343\2\0\4\343\2\0\2\343\1\0\1\331\1\0"+
    "\2\343\1\0\5\343\1\0\1\344\2\0\5\344\2\0"+
    "\4\344\2\0\2\344\2\0\1\347\2\344\1\0\5\344"+
    "\11\0\1\350\7\0\1\310\15\0\1\351\2\0\5\351"+
    "\2\0\4\351\2\0\2\351\2\0\1\346\2\351\1\0"+
    "\5\351\1\0\1\352\2\0\5\352\2\0\4\352\2\0"+
    "\2\352\2\0\1\347\2\352\1\0\5\352\1\0\1\353"+
    "\2\0\5\353\1\350\1\0\4\353\2\0\2\353\3\0"+
    "\2\353\1\0\5\353\1\0\1\351\2\0\5\351\2\0"+
    "\4\351\2\0\2\351\1\354\2\0\2\351\1\0\5\351"+
    "\1\0\1\352\2\0\5\352\2\0\4\352\2\0\2\352"+
    "\1\355\2\0\2\352\1\0\5\352\1\0\1\353\2\0"+
    "\5\353\2\0\4\353\2\0\2\353\2\0\1\356\2\353"+
    "\1\0\5\353\1\0\1\357\2\0\5\357\2\0\4\357"+
    "\2\0\2\357\1\354\2\0\2\357\1\0\5\357\1\0"+
    "\1\360\2\0\5\360\2\0\4\360\2\0\2\360\1\355"+
    "\2\0\2\360\1\0\5\360\1\0\1\361\2\0\5\361"+
    "\2\0\4\361\2\0\2\361\2\0\1\356\2\361\1\0"+
    "\5\361\1\0\1\357\2\0\5\357\2\0\4\357\2\0"+
    "\2\357\2\0\1\362\2\357\1\0\5\357\1\0\1\360"+
    "\2\0\5\360\2\0\4\360\2\0\2\360\2\0\1\363"+
    "\2\360\1\0\5\360\1\0\1\361\2\0\5\361\2\0"+
    "\4\361\2\0\2\361\1\364\2\0\2\361\1\0\5\361"+
    "\1\0\1\365\2\0\5\365\2\0\4\365\2\0\2\365"+
    "\2\0\1\362\2\365\1\0\5\365\1\0\1\366\2\0"+
    "\5\366\2\0\4\366\2\0\2\366\2\0\1\363\2\366"+
    "\1\0\5\366\1\0\1\367\2\0\5\367\2\0\4\367"+
    "\2\0\2\367\1\364\2\0\2\367\1\0\5\367\1\0"+
    "\1\370\2\0\5\370\1\371\1\0\4\370\1\342\1\0"+
    "\2\370\3\0\2\370\1\0\5\370\1\0\1\366\2\0"+
    "\5\366\1\333\1\0\4\366\1\220\1\0\2\366\3\0"+
    "\2\366\1\0\5\366\1\0\1\367\2\0\5\367\2\0"+
    "\4\367\2\0\2\367\2\0\1\372\2\367\1\0\5\367"+
    "\1\0\1\370\2\0\5\370\1\371\1\0\4\370\1\342"+
    "\1\0\2\370\2\0\1\346\2\370\1\0\5\370\1\0"+
    "\1\340\2\0\5\340\1\371\1\0\4\340\1\342\1\0"+
    "\2\340\3\0\2\340\1\0\5\340\1\0\1\373\2\0"+
    "\5\373\2\0\4\373\2\0\2\373\2\0\1\372\2\373"+
    "\1\0\5\373\1\0\1\373\2\0\5\373\1\230\1\0"+
    "\4\373\1\231\1\0\2\373\3\0\2\373\1\0\5\373";

  private static int [] zzUnpackTrans() {
    int [] result = new int[7260];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\4\1\170\0\1\11\17\0\1\11\10\0"+
    "\1\11\110\0\1\11\31\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[251];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
public String lexeme;


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 102) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 2: 
          { /*Ignore*/
          }
        case 7: break;
        case 4: 
          { lexeme=yytext(); return SELEC;
          }
        case 8: break;
        case 3: 
          { lexeme=yytext(); return SELECDIR;
          }
        case 9: break;
        case 6: 
          { lexeme=yytext(); return DELET;
          }
        case 10: break;
        case 1: 
          { return ERROR;
          }
        case 11: break;
        case 5: 
          { lexeme=yytext(); return UPDAT;
          }
        case 12: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
