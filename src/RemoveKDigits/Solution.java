package RemoveKDigits;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(removeKdigits("1432219", 3));
//		System.out.println(removeKdigits("1432919", 3));
//		System.out.println(removeKdigits("10200", 1));
//		System.out.println(removeKdigits("1020", 1));
		System.out.println(removeKdigits("46900921143792939364743905907950430048283194895142016116725375680708410240152701078408134553651580164491932801308171825396210278622255397833294658953343807276028918394493791856095113449458295083153689258883783683775548328139495186195803711309448744190052686954103486010047267302647738396061446199596096906093158640242942067769230761708585639094504320596613786797994860240890299387445224817394531237806070669278580225674889375081404025436351818668368411467267112612516597194754941960565937596900371226287881328164833843729742259514509795321954787918013398424660697956114437767577585027801161881388768041873657013272416829674548600712219000965861841896807411811696914598183392164046305225248146398228574505936162527537984716023768908748335099200075916132949688475402252069567078211231605024929344378722114657821834717307274964255840723222095101219630080319167250637066967221314742878581159189819442427279476001316135735039114433778654900398513071617394641844114176128159380190644772098737920243508650625587861653796098197385614977428960880188485216800731470473242158382863997047515423091529580553304782874984247884344393401887541552242354733836150859650508291566416026373218892631491741002416280728017302638214800819207944420834804623709089464759914909362679524593759144026476799520704263914808345549710437518318582285217362461490954907378903645213467024882966816537188324075234675328991350200679327925942580565476546962009568167175780969440477068305390830644952856951615021788464984607710752774132484535611678970461816146548892465500908903863341160126029509337788654573484705475446571354525665464995686005369643015051403594737201252633746589565791879659941792504206762095533277105354037004844839981119815222326956264561553595324705124551113968698733829542539356972662374024132069824524718604667514482787361785517101892449890010058152868221006296857803998397066228812998722783403578157447630093221298772300332427652266384913264807824319995905639668920640920071145386181790364769931002095513621588119598809021507872503296820800567145036325577078354094815207062129549308685255816906171588639379392764277180770782807277154895660903841468363031268684031448351220067550266376002828401850338455491406999926852519826693509125765726269430249352244080903757146271662669991293077204503441808224071192461936512220865713295540302882327178779286355033361679226354202665747840201322423671598489693280232698835025937531610214399747097957718254214843516013567235522864417000379455965017240867730229825390567860693819996632303772825110319973393982361222145712444158451131921145168123771413898527834930572086613530814080311464291518450529782559509446748909946958976259123146047793434589223952698074923045407472188393500843619699097867641968009559911315121641754319437079094067556163546176249058599059665460825966748147681953266354541032679697938094907325933451500857921482751989260722896362598809175579591933784726692976987869502663790757355309861085051726265392208943150211143006158689561077058748504854644757581294818391231301459793351494286447784775357674328218268690404662285966054021806956486120931152478121966235300605547349093343068790227596862427753900090988363069291386243897852729302475120866155031618363701998690191222869002007372754140150710132308124242822580823834590356018704117259934150711285982652733109559783371308422916216030810411006215953862431664631267480598022359626694334779895263278935363366817393372043904923929598307532585839912358881737676667128182096063070827765762521331978014944067008707878422702981416309307528645513132017671328769132579634104170629097696285210394357035747469727031155813563158282241000040773928244845459654534023243250847666620809555276722233354145662582769799520396609692301180214491533710758558100538583202442316897714463679705834757905210759695156783560115795740058038820794183672928436782629993190280840727526164855133351254889729335424284636360099390796592183413922813313964555943046441752615578621085918504547763022167919764184682443169761827278377063462605153279149980079943220533841907345929555354649111405853801739445792044906593141055621823510062079761262301017795384281252954717793922268951491038045011054961893791583486636249658240497114427597743226025760030541165439470578783498810618235014375707032324516371946380238205791105008179545725972358062181813233612571597370902067196665115123485737658883344476954728851940160793728706541140357844375514940344218552600744742671679343950436042602547991669801495398012554167786935250736777686530531310113032016083607251343585029458393544901346647512266348733403489747191535967006165946105839523824820802709100482495039046383653044537627909195181455547244081734166714589865778920386168698671463933356147794367296834121054985259417690035917068748267188392860351404125414298376304320971992757229828861181704038158807679770369775599876082727991742225918069149854879045700163482564734691128716283172449145882748213807115921713885930768025297857818788967261076652544445991064147510637881781752232286658390770111654388011171556708011378098873211856434311914961243084948670229639471113805893546495352557366064291331572901807264818075266722990255329871422208641610540396603440898441251653407641617065622475084136534494371519678946281701220687058687950214214987403821909672582512034335810507398425645382939892161167148307290657917064838185135467914938789386290333326372556587624702797165920140051549047226266880604462848195529736013623101767084355253118229116109053823035514195610941204633575686733363948784333809424463430144361377160487652929675647806487028190640690496769721927612547835550896677863180966604873585029968019967618287242146979883137024354886612128862043050702175298430557020041706818308657031589346894069394015286389927042504088241010187640762314135780879023730540667478610365265716827518582272845726002300315364835515633148320195043044806150803525349659978432225825054355663569936058606481066943250978636996984989088375987454969892168289377451707909229309761135819562749637449569345606608558647315324558863897848528681453257639828732411588270354254567439351315643759652933400418597713462504251044803651825065996945612949445535145121001118377826460289187044603962337167354257225842626454230718993127345017903333618357976977035642030778793124325179931714352168195174524021346434430785128074965881185799595860724012672988800458177499236941213579892141711101768880217553287684995618785117347355500837281362901806978980328833348841035214606736520748425390530194118242862826047230502655104925774714633182738828527634301180349020705877440305926626741155318394778108920406448482075271551530561543465417990179219228286759304378532986856456637182716012742378196828440783958582382215338054896797166268252167063825218779445059714357994469207134460564455478794530433424670188526361276526860650708516355700464886771417245505320944767466192043390888757949871472785089698745778095207699868868788032812860255630556673960181981341805835941281529371112707566730825105065116458713710962367858200115127223322884599872759877115714746276869844043409312275666292046153098938367378855708384557545526642089734817974488462085824454425396910553208163409701462525326625280281692693110629855068037226829757703530381696425478474470274828181647421723037569156232697606796858050722096842939865605743501919537297866148012990962253425571707161215161598110712643098842874277222665331827222656772863620822066143841944147522095899618161746703672887075492473510410638268740961378471033730128509838380137613692009816472583299933886630128175080686789191492171470734426739508181403767123052642326041345317450915655524409083662404668905304341513628621948725536849789135931455636127567824726441361474222453190345803876825476458726601122578173574612359900378822212743705381513166694831138976165256445833827334682006371205354357586818607668270441795523029376088564374908540166783874827774860016234612024195556976317552256673987988101819422201249562013582352157687330621432296794243962836088698447933985897809815361091060848714786901236938903122172525888521875487974953329091062442930298390249777854910737476969733293687478681412329038332016286790122198362649693169646309217585932658372147729631415624603180422821558302176395026885417405666542011911588675258056141723004965600592002225238471914293508287567830679890363842690981331529470161039519826895194598624956115377330440563902037571699982840464647005713478717105507434876873508924856314843108932538222874053713611016446912271246191280056807052530131956795248002174329146840871557184492313624919113849498003551181986434185198720256187952878227102399721797513461344616786496767299388978961428815563313556725678458449359393280485852053619651738722333199759963594454625505784750139235453240600009834479783152091058874184991769341309902951393035438396822545341737445144118035821463845551463104573302769295685609468237303396626844486012200998554563065116289032437019156380362691299991325472183306859004915384286553176751373209790911054974395954864427418565269710517299844242914286311767609978539072799076376496937122222313715534352130759142706117736480645262832789196578310476031695761416670198393534604654430618933693088784932878420359208581324932972492446066997259870058620032275104918743347340562340792564025242407804956948929572219753895402814974972042803810361156769450813502861254043209940746660319238156927840680088531413884003652920613885566018517748725902173512065762385220087069151159308862019571002633093144477186038193820055516020434323705015314294804491281240509291924656245609443998445446119323046838482792833813526560296270971590728380579562142362781192779344430960323105741173878477628702417503287223358415926783794831799757710578006626514604229162218779662998255135299547912072152879064441137258604410101814404605577642009144179688407113974067239303080588292996177233428845368375030264252544698653395976157214589764241631426351588779902312609888545029586211369331053692630644932233511737970427766451137412323176660309810086889827799128210907747121257080703085060587318988678140767411182397073"
		,555));

	}
	
    public static String removeKdigits(String num, int k) {
    	int len = num.length();
        if(k >= len){
        	return "0";
        }
        while(k > 0){
        	num = removeOneDigit(num);
        	k--;
        }
        
    	return num;
    }
    
    public static String removeOneDigit(String num){
    	String copy = num;
    	if(num.length() == 2){
    		if(num.charAt(0) > num.charAt(1)){
    			num = num.substring(1);
    			return num;
    		}else{
    			num = num.substring(0, 1);
    			return num;
    		}
    	}
    	
    	if(num.charAt(1)!='0'){
    		if(num.charAt(0) > num.charAt(1))
    			num = copy.substring(1);
    		else if( num.charAt(1) >= num.charAt(2))
    			num = copy.charAt(0) + copy.substring(2);
    		else if ( num.charAt(1) < num.charAt(2)){
    			num = copy.substring(0, 2) + copy.substring(3);
    		}
    	}else{
    		num = copy.substring(1);
    		while(true){
    			if(num.charAt(0) == '0')
    				num = num.substring(1);
    			else
    				break;
    		}
    		
    	}
    	if(num == "" || num == null)
    		return "0";
    	return num;
    }

}
