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



    public String[] romanSentence(){
        StringBuilder romanSentence = new StringBuilder();
        StringBuilder romanAnswerSentence = new StringBuilder();
        for (int i=0;i<10;i++){
            Random r = new Random();
            int r1 = r.nextInt(108);
            int r2 = r.nextInt(2);
            romanSentence.append(roman[r1]);
            romanSentence.append("(");
            romanSentence.append(type[r2]);
            romanSentence.append(")");
            romanSentence.append(",");

            generateAnswer(romanAnswerSentence, r1, type[r2]);
        }
        return new String[]{ romanSentence.toString(),romanAnswerSentence.toString() };
    }

    private void generateAnswer(StringBuilder romanAnswerSentence, int r1, String type) {
        if(type.equals("平")){
            romanAnswerSentence.append(hiragana[r1]);
        }else{
            romanAnswerSentence.append(katakana[r1]);
        }
        romanAnswerSentence.append(",");
    }

    public String[] sentence(){
        StringBuilder sentence = new StringBuilder();
        List<String> list = new ArrayList<>();
        StringBuilder answer = new StringBuilder();
        for (int i=0;i<10;i++){
            Random r = new Random();
            int r1 = r.nextInt(108);
            int r2 = r.nextInt(108);
            list.add("(");
            list.add(hiragana[r1]);
            list.add(",");
            list.add(katakana[r2]);
            list.add(")");
            answer.append("(");
            answer.append(roman[r1]);
            answer.append(",");
            answer.append(roman[r2]);
            answer.append(")");
//            Collections.shuffle(list);
        }
        list.forEach(sentence::append);
        return new String[]{ sentence.toString() , answer.toString() };
    }
//    public String romanSentenceAnswer(){
//
//    }
}
