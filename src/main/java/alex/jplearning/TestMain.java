package alex.jplearning;

import java.util.*;

public class TestMain {

    String[] type = new String[]{"平","片"};

    //罗马音
    String[] roman = new String[]{
            "a","i","u","e","o",
            "ka","ki","ku","ke","ko",
            "sa","shi","su","se","so",
            "ta","chi","tsu","te","to",
            "na","ni","nu","ne","no",
            "ha","hi","hu","he","ho",
            "ma","mi","mu","me","mo",
            "ya","i","yu","e","yo",
            "ra","ri","ru","re","ro",
            "wa","i","u","e","wo",
            "n",
            "ga","gi","gu","ge","go",
            "za","ji","zu","ze","zo",
            "da","di","du","de","do",
            "ba","bi","bu","be","bo",
            "pa","pi","pu","pe","po",
            "kya","kyu","kyo",
            "sha","shu","sho",
            "cha","chu","cho",
            "nya","nyu","nyo",
            "hya","hyu","hyo",
            "mya","myu","myo",
            "rya","ryu","ryo",
            "gya","gyu","gyo",
            "ja","ju","jo",
            "bya","byu","byo",
            "pta","pyu","pyo"
    };

    //平假名
    String[] hiragana = new String[]{
            "あ","い","う","え","お",
            "か","き","く","け","こ",
            "さ","し","す","せ","そ",
            "た","ち","つ","て","と",
            "な","に","ぬ","ね","の",
            "は","ひ","ふ","へ","ほ",
            "ま","み","む","め","も",
            "や","い","ゆ","え","よ",
            "ら","り","る","れ","ろ",
            "わ","い","う","え","を",
            "ん",
            "が","ぎ","ぐ","げ","ご",
            "ざ","じ","ず","ぜ","ぞ",
            "だ","ぢ","づ","で","ど",
            "ば","び","ぶ","べ","ぼ",
            "ぱ","ぴ","ぷ","ぺ","ぽ",
            "きゃ","きゅ","きょ",
            "しゃ","しゅ","しょ",
            "ちゃ","ちゅ","ちょ",
            "にゃ","にゅ","にょ",
            "ひゃ","ヒュ","ひょ",
            "みゃ","みゅ","みょ",
            "りゃ","りゅ","りょ",
            "ぎゃ","ぎゅ","ぎょ",
            "じゃ","じゅ","じょ",
            "びゃ","びゅ","びょ",
            "ぴゃ","ぴゅ","ぴょ"
    };


    //片假名
    String[] katakana = new String[]{
            "ア","イ","ウ","エ","オ",
            "カ","キ","ク","ケ","コ",
            "サ","シ","ス","セ","ソ",
            "タ","チ","ツ","テ","ト",
            "ナ","ニ","ヌ","ネ","ノ",
            "ハ","ヒ","フ","ヘ","ホ",
            "マ","ミ","ム","メ","モ",
            "ヤ","い","ユ","え","ヨ",
            "ラ","リ","ル","レ","ロ",
            "ワ","い","う","え","ヲ",
            "ン",
            "ガ","ギ","グ","ゲ","ゴ",
            "ザ","ジ","ズ","ゼ","ゾ",
            "ダ","ヂ","ヅ","デ","ド",
            "バ","ビ","ブ","ベ","ボ",
            "パ","ピ","プ","ペ","ポ",
            "キャ","キュ","キョ",
            "シャ","シュ","ショ",
            "チャ","チュ","チョ",
            "ニャ","ニュ","ニョ",
            "ヒャ","ヒュ","ヒョ",
            "ミャ","ミュ","ミョ",
            "リャ","リュ","リョ",
            "ギャ","ギュ","ギョ",
            "ジャ","ジュ","ジョ",
            "ビャ","ビュ","ビョ",
            "ピャ","ピュ","ピョ"
    };

    String[] vocalHiragana = new String[]{
            "が","ぎ","ぐ","げ","ご",
            "ざ","じ","ず","ぜ","ぞ",
            "だ","ぢ","づ","で","ど",
            "ば","び","ぶ","べ","ぼ",
            "ぱ","ぴ","ぷ","ぺ","ぽ"
    };

    String[] vocalKatakana = new String[]{
            "ガ","ギ","グ","ゲ","ゴ",
            "ザ","ジ","ズ","ゼ","ゾ",
            "ダ","ヂ","ヅ","デ","ド",
            "バ","ビ","ブ","ベ","ボ",
            "パ","ピ","プ","ペ","ポ"
    };

    String[] awkwardGana = new String[]{
            "きゃ","きゅ","きょ",
            "しゃ","しゅ","しょ",
            "ちゃ","ちゅ","ちょ",
            "にゃ","にゅ","にょ",
            "ひゃ","ヒュ","ひょ",
            "みゃ","みゅ","みょ",
            "りゃ","りゅ","りょ",
            "ぎゃ","ぎゅ","ぎょ",
            "じゃ","じゅ","じょ",
            "びゃ","びゅ","びょ",
            "ぴゃ","ぴゅ","ぴょ"
    };

    String[] awkwardKana = new String[]{
            "キャ","キュ","キョ",
            "シャ","シュ","ショ",
            "チャ","チュ","チョ",
            "ニャ","ニュ","ニョ",
            "ヒャ","ヒュ","ヒョ",
            "ミャ","ミュ","ミョ",
            "リャ","リュ","リョ",
            "ギャ","ギュ","ギョ",
            "ジャ","ジュ","ジョ",
            "ビャ","ビュ","ビョ",
            "ピャ","ピュ","ピョ"
    };



    public String romanSentence(){
        StringBuilder romanSentence = new StringBuilder();
        for (int i=0;i<40;i++){
            Random r = new Random();
            romanSentence.append(roman[r.nextInt(108)]);
            romanSentence.append("(");
            romanSentence.append(type[r.nextInt(2)]);
            romanSentence.append(")");
            romanSentence.append(",");
        }
        return romanSentence.toString();
    }

    public String sentence(){
        StringBuilder sentence = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i=0;i<40;i++){
            Random r = new Random();
            list.add(hiragana[r.nextInt(108)]);
            list.add(katakana[r.nextInt(108)]);

            Collections.shuffle(list);

        }
        list.forEach(sentence::append);
        return sentence.toString();
    }
}
