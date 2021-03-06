package basedatos;

import informacion.hoteles_model;
import informacion.universidades_model;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class basedatos {

	public static final String ID_FILA = "_id";
	public static final String ID_NOMBRE = "nombre";
	public static final String ID_RANGO = "rango";
	public static final String ID_CATEGORIA = "categoria";
	public static final String ID_COSTO_S = "costo_s";
	public static final String ID_COSTO_D = "costo_d";
	public static final String ID_COSTO_T = "costo_t";
	public static final String ID_COSTO_M = "costo_m";
	public static final String ID_COSTO_C = "costo_c";
	public static final String ID_COSTO_CX = "costo_cx";
	public static final String ID_TELEFONO = "telefono";
	public static final String ID_DIRECCION = "direccion";
	public static final String ID_IMAGEN = "imagen";
	public static final String ID_LATITUD = "latitud";
	public static final String ID_LONGITUD = "longitud";
	private static final String N_TABLA = "tabla_hoteles";
	
	public static final String ID_EDECANES = "_id";
	public static final String ID_NOMBRE_E = "nombre";
	public static final String ID_UNIVERSIDAD = "universidad";
	public static final String ID_CELULAR = "telefono";
	public static final String ID_REGION = "region";
	public static final String ID_FACEBOOK = "facebook";
	private static final String N_TABLA_E = "tabla_edecanes";
	
	private static final String N_BD = "coneisc";
	
	private static final int VERSION_BD = 1;
	private BDHelper nHelper;
	public final Context nContexto;
	private SQLiteDatabase nBD;
	private Cursor cursor;
	private static class BDHelper extends SQLiteOpenHelper {
		public BDHelper(Context context) {
			super(context, N_BD, null, VERSION_BD);
			// TODO Auto-generated constructor stub
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			
			//creamos la tabla edecanes
			db.execSQL("CREATE TABLE " + N_TABLA_E + "(" + 
					ID_EDECANES + " INTEGER PRIMARY KEY, " + 
					ID_NOMBRE_E + " TEXT, "+ 
					ID_UNIVERSIDAD + " TEXT, " 
					+ ID_CELULAR + " TEXT, "
					+ ID_REGION + " TEXT, "+ 
					ID_FACEBOOK + " TEXT);");
			
			db.execSQL("CREATE TABLE " + N_TABLA + "(" + ID_FILA
					+ " INTEGER PRIMARY KEY, " + ID_NOMBRE + " TEXT, "
					+ ID_RANGO + " TEXT, " + ID_CATEGORIA + " TEXT, "
					+ ID_COSTO_S + " INTEGER, " + ID_COSTO_D + " INTEGER, "
					+ ID_COSTO_T + " INTEGER, " + ID_COSTO_M + " INTEGER, "
					+ ID_COSTO_C + " INTEGER, " + ID_COSTO_CX + " INTEGER, "
					+ ID_TELEFONO + " TEXT, " + ID_DIRECCION + " TEXT, "
					+ ID_IMAGEN + " TEXT, " + ID_LATITUD + " TEXT, "
					+ ID_LONGITUD + " TEXT); ");
			
db.execSQL("INSERT INTO "+N_TABLA+" VALUES(1, 'Hospedaje las Palmeras', 'S/.15 - S/.25', 'Hospedaje', 20, 35, 50, null, null, null, '042-525475', 'Jr. Miguel Grau No 229', 'http://tarapotoventas.tk/descargas/hoteles/las%20palmeras.JPG', '-6.482499899730129', '-76.36476516723633')");
db.execSQL("INSERT INTO "+N_TABLA+" VALUES(2, 'Alojamiento Melendez', 'S/.10 - S/.15', 'Alojamiento', 10, 12, null, null, null, null, '042-532468', 'Jr. Pedro de Urz�a No 464', 'http://2.bp.blogspot.com/-1Hb7Tna5Fv0/UKf-Qa7EswI/AAAAAAAANnE/iWm3gwiJD_0/s1600/Sin_imagen.jpg', '-6.489170500783605', '-76.36165112257004')");
db.execSQL("INSERT INTO "+N_TABLA+" VALUES(3, 'Alojamiento El Mirador', 'S/.25 - S/.35', 'Alojamiento', 60, 85, 95, 80, 120, null, '042-522177', 'Jr. San Pablo de la Cruz No 517', 'http://tarapotoventas.tk/descargas/hoteles/mirador.JPG', '-6.484951748972487', '-76.35613918304443')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(4, 'Alojamiento July', 'S/.15 - S/.25', 'Alojamiento', 30, 20, 20, null, 20, null, '042-522087', 'Jr. Alegria Arias de Morey No 205 - 219', 'http://tarapotoventas.tk/descargas/hoteles/july.JPG', '-6.486811948375939', '-76.36075794696808')");
db.execSQL("INSERT INTO "+N_TABLA+" VALUES(5, 'Alojamiento  San Luis', 'S/.15 - S/.25', 'Alojamiento', 20, 25, null, 25, null, null, '042-522319', 'Jr. Jimenez Pimentel No 324', 'http://tarapotoventas.tk/descargas/hoteles/san_luis.JPG', '-6.4899513524244785', '-76.36152505874634')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(6, 'Alojamiento Miami', 'S/.15 - S/.25', 'Alojamiento', 30, 45, 55, 40, null, null, '042-523485', 'Jr. Pedro de Urz�a No 289', 'http://tarapotoventas.tk/descargas/hoteles/miami.JPG', '-6.490367095466375', '-76.36039853096008')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(7, 'Alojamiento Grau', 'S/.15 - S/.25', 'Alojamiento', 30, 50, null, 40, null, null, '042-523777', 'Jr. Miguel Grau No 243', 'http://tarapotoventas.tk/descargas/hoteles/grau.JPG', '-6.486177669121559', '-76.36070966720581')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(8, 'Hospedaje La Patarashca', 'S/.35 - S/.50', 'Hospedaje', 65, 105, 135, 105, 170, null, '042-527554', 'Jr. San Pablo de la Cruz 362', 'http://tarapotoventas.tk/descargas/hoteles/patarashca.JPG', '-6.486092387816401', '-76.35752320289612')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(9, 'Hospedaje El Paso Texas', 'S/.15 - S/.25', 'Hospedaje', 25, 40, 50, 35, null, null, '042-523799', 'Jr. Alegria Arias de Morey 115', 'http://tarapotoventas.tk/descargas/hoteles/paso%20texas.JPG', '-6.487198378622738', '-76.36139363050461')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(10, 'Alojamiento Luis Fernando ', 'S/.25 - S/.35', 'Alojamiento', 40, 60, null, 50, null, null, '042-529975', 'Jr. Alegria A. de Morey 247', 'http://tarapotoventas.tk/descargas/hoteles/luis%20fernando.JPG', '-6.486779967928451', '-76.36091887950897')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(11, 'Hospedaje Miguelito', 'S/.15 - S/.25', 'Hospedaje', 25, 40, null, 65, null, null, '042-522751', 'Jr. Alfonso Ugarte No. 312 - B', 'http://tarapotoventas.tk/descargas/hoteles/miguelito.JPG', '-6.4877820209854', '-76.36364936828613')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(12, 'Alojamiento D & F', 'S/.15 - S/.25', 'Alojamiento', 25, 35, null, null, null, null, ' 909603', 'Jr. Orellana No. 135', 'http://tarapotoventas.tk/descargas/hoteles/df.JPG', '-6.490890771309597', '-76.36478662490845')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(13, 'Alojamiento Viajero Wassi', 'S/.15 - S/.25', 'Alojamiento', 30, 40, 45, 35, null, null, '042-530368', 'Jr. Andres Avelino Caceres No 145', 'http://tarapotoventas.tk/descargas/hoteles/viajero%20wasi.JPG', '-6.485390149020469', '-76.36334896087646')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(14, 'Alojamiento Fernando', 'S/.15 - S/.25', 'Alojamiento', 20, 40, 50, 30, null, null, '972610005', 'Jr. Lima No 299', 'http://tarapotoventas.tk/descargas/hoteles/fernando.JPG', '-6.486007106496793', '-76.36504411697388')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(15, 'Alojamiento Oriente', 'S/.15 - S/.25', 'Alojamiento', null, 20, 20, null, 20, null, '042-522783', 'Jr. Alfonso Ugarte No 154', 'http://tarapotoventas.tk/descargas/hoteles/oriente.JPG', '-6.486614735584055', '-76.36221170425415')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(16, 'La Posada del Mirador', 'S/.15 - S/.25', 'Alojamiento', 25, 40, 60, 35, null, null, '042-527048', 'Jr. Nicolas de Pierola No 381', 'http://2.bp.blogspot.com/-1Hb7Tna5Fv0/UKf-Qa7EswI/AAAAAAAANnE/iWm3gwiJD_0/s1600/Sin_imagen.jpg', '-6.486360224366937', '-76.36524796485901')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(17, 'Hospedaje Trujillano', 'S/.15 - S/.25', 'Hospedaje', 25, 35, 45, null, null, null, '042-531073', 'Jr. Alonso Alvarado No. 444', 'http://tarapotoventas.tk/descargas/hoteles/el%20trujillano.JPG', '-6.486273610572633', '-76.36584877967834')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(18, 'Hospedaje Gran Chimu', 'S/.15 - S/.25', 'Hospedaje', 25, 35, 45, null, 55, null, '042-522973', 'Jr. Cahuide No. 396', 'http://tarapotoventas.tk/descargas/hoteles/gran_chimu.JPG', '-6.488341677410511', '-76.35686874389648')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(19, 'Hospedaje Costa Verde', 'S/.15 - S/.25', 'Hospedaje', null, 20, 20, null, 20, null, '042-522854 - 042-527286', 'Jr. Tahuantinsuyo No. 144', 'http://tarapotoventas.tk/descargas/hoteles/costa%20verde.JPG', '-6.4883310172939295', '-76.365065574646')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(20, 'Alojamiento San Mart�n', 'S/.15 - S/.25', 'Alojamiento', 25, 40, 50, 35, null, null, '042-520147', 'Jr. Martinez de Compa�on No. 273', 'http://tarapotoventas.tk/descargas/hoteles/san%20martin.JPG', '-6.488789402102947', '-76.36167526245117')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(21, 'Hospedaje Viluz', 'S/.15 - S/.25', 'Hospedaje', 25, 30, null, 25, null, null, '042-530108 - 042-525281', 'Jr. Cabo Alberto Leveau No 340', 'http://tarapotoventas.tk/descargas/hoteles/viluz.JPG', '-6.491135952687701', '-76.36116027832031')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(22, 'Alojamiento y Restaurant Santa M�nica', 'S/.15 - S/.25', 'Alojamiento', null, 15, 15, null, 15, null, '042-528160', 'Jr. Alfonso Ugarte No 566', 'http://2.bp.blogspot.com/-1Hb7Tna5Fv0/UKf-Qa7EswI/AAAAAAAANnE/iWm3gwiJD_0/s1600/Sin_imagen.jpg', '-6.489023924402095', '-76.36533379554749')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(23, 'Hosteria Residencial Amazonas', 'S/.15 - S/.25', 'Hosteria', 35, 45, null, null, null, null, '042-528199', 'Jr. Pedro de Urz�a No. 370 - 374', 'http://tarapotoventas.tk/descargas/hoteles/amazonas.JPG', '-6.490671573726479', '-76.36026978492737')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(24, 'Hospedaje Misti', 'S/.25 - S/.35', 'Hospedaje', null, 30, 30, null, 30, null, '042-522439', 'Jr. Leoncio Prado No. 341', 'http://tarapotoventas.tk/descargas/hoteles/misti.JPG', '-6.4850810037375135', '-76.36072039604187')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(25, 'Alojamiento Copacabana', 'S/.15 - S/.25', 'Alojamiento', 35, 45, 55, null, null, null, '042-522301', 'Jr. Jimenez Pimentel No. 324', 'http://tarapotoventas.tk/descargas/hoteles/copacabana.JPG', '-6.4899300322592275', '-76.36139631271362')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(26, 'Alojamiento Lima', 'S/.15 - S/.25', 'Alojamiento', 20, 30, null, null, null, null, '042-523821', 'Jr. Lima No. 769', 'http://tarapotoventas.tk/descargas/hoteles/lima.JPG', '-6.48380577744121', '-76.36748492717743')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(27, 'Alojamiento El Pueblo', 'S/.15 - S/.25', 'Alojamiento', 20, 25, null, null, null, null, '042-341295', 'Jr. Nicolas de Piérola No. 342', 'http://tarapotoventas.tk/descargas/hoteles/el%20pueblo.JPG', '-6.485528731327143', '-76.36489391326904')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(28, 'Alojamiento La Siesta', 'S/.15 - S/.25', 'Alojamiento', 30, 40, 50, null, null, null, '042-521556', 'Jr. Progreso No. 468', 'http://2.bp.blogspot.com/-1Hb7Tna5Fv0/UKf-Qa7EswI/AAAAAAAANnE/iWm3gwiJD_0/s1600/Sin_imagen.jpg', '-6.492757611296594', '-76.3614821434021')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(29, 'Alojamiento Al��', 'S/.15 - S/.25', 'Alojamiento', 30, 45, 50, 35, null, null, '042-531599', 'Jr. Miguel Grau No. 265', 'http://tarapotoventas.tk/descargas/hoteles/ali.JPG', '-6.486468158458994', '-76.36096715927124')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(30, 'Alojamiento La Inolvidable', 'S/.15 - S/.25', 'Alojamiento', 30, 45, null, null, null, null, '042-341096', 'Jr. Martin de la Riva No.  235', 'http://tarapotoventas.tk/descargas/hoteles/la%20inolvidable.JPG', '-6.484238848384253', '-76.36623501777649')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(31, 'Hospedaje El Encanto', 'S/.15 - S/.25', 'Hospedaje', 25, 35, 45, 25, null, null, '042-523996', 'Jr. Tahuantinsuyo No. 856', 'http://tarapotoventas.tk/descargas/hoteles/el%20encanto.JPG', '-6.483907049448918', '-76.3690459728241')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(32, 'Alojamiento Ahuashiyacu', 'S/.15 - S/.25', 'Alojamiento', null, 50, 60, null, null, null, '042-521086', 'Jr. Martin de la Riva No. 240', 'http://tarapotoventas.tk/descargas/hoteles/ahuashiyacu.JPG', '-6.484420071806925', '-76.36594533920288')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(33, 'Hospedaje El Peregrino', 'S/.15 - S/.25', 'Hospedaje', 15, 30, null, null, null, null, '042-503459', 'Jr. Tahuantinsuyo Nro 574', 'http://tarapotoventas.tk/descargas/hoteles/el%20peregrino.JPG', '-6.485751262451392', '-6.485751262451392')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(34, 'Hospedaje El Milenio', 'S/.15 - S/.25', 'Hospedaje', 50, null, null, 50, null, null, '942929090', 'Jr. Lima 267 - 269', 'http://tarapotoventas.tk/descargas/hoteles/el%20milenio.JPG', '-6.486689356649517', '-76.36407852172852')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(35, 'Alojamiento La Florida Inn', 'S/.15 - S/.25', 'Alojamiento', null, 40, null, 30, null, null, '042-523808', 'Jr. Santa Rosa No. 595', 'http://tarapotoventas.tk/descargas/hoteles/la%20florida.JPG', '-6.48713841532801', '-76.36687874794006')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(36, 'Mary House Alojamiento', 'S/.15 - S/.25', 'Alojamiento', 25, 40, 45, 35, null, null, '042-523260', 'Jr.Alfonso Ugarte Nro 324', 'http://tarapotoventas.tk/descargas/hoteles/mary%20house.JPG', '-6.487941922884585', '-76.36363327503204')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(37, 'Hospedaje Vista Verde', 'S/.15 - S/.25', 'Hospedaje', 40, 50, null, 60, null, null, '042-528565', 'Jr. Ramon Castilla No. 930 - Urb. Los Jardines', 'http://2.bp.blogspot.com/-1Hb7Tna5Fv0/UKf-Qa7EswI/AAAAAAAANnE/iWm3gwiJD_0/s1600/Sin_imagen.jpg', '-6.491990089056291', '-76.36755466461182')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(38, 'Gold Tarapoto Hospedaje', 'S/.35 - S/.50', 'Hospedaje', null, 100, 120, 80, null, null, '042-521200', 'Jr. Alegria A. de Morey No 251', 'http://tarapotoventas.tk/descargas/hoteles/gold%20tarapoto.JPG', '-6.48670001680083', '-76.3608330488205')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(39, 'Heliconias Gran Hospedaje', 'S/.25 - S/.35', 'Hospedaje', 35, 60, 75, 50, null, null, '042-526526', 'Jr. Pedro de Urz�a No. 309', 'http://tarapotoventas.tk/descargas/hoteles/heliconia.JPG', '-6.490517668983431', '-76.36006593704224')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(40, 'Hospedaje La Novia', 'S/.15 - S/.25', 'Hospedaje', null, 45, 55, 30, null, null, '975731267', 'Jr. Lima Cdra 8 (Jr. Lima 898 - C08)', 'http://tarapotoventas.tk/descargas/hoteles/la%20novia.JPG', '-6.48329941709758', '-76.36870265007019')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(41, 'Hospedaje Sol de Piura', 'S/.25 - S/.35', 'Hospedaje', 25, null, null, null, null, null, '042-530757', 'Jr. Ricardo Palma No. 954', 'http://tarapotoventas.tk/descargas/hoteles/sol%20de%20piura.JPG', '-6.494941578768994', '-76.36503338813782')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(42, 'Alojamiento Gran Pajaten', 'S/.25 - S/.35', 'Alojamiento', 50, 60, 80, 50, null, null, '042-522532', 'Jr. Tahuantinsuyo No. 167', 'http://tarapotoventas.tk/descargas/hoteles/gran%20pajaten.JPG', '-6.488288376825378', '-76.36517286300659')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(43, 'Hospedaje  Turismo Sol y Luna ', 'S/.15 - S/.25', 'Hospedaje', 25, 40, 60, null, null, null, '042-524703', 'Jr. Nicolas de Pierola No. 529', 'http://tarapotoventas.tk/descargas/hoteles/sol%20y%20luna.JPG', '-6.486850591413969', '-76.36565566062927')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(44, 'Morales Beach Alojamiento', 'S/.15 - S/.25', 'Alojamiento', 25, 40, null, 35, null, null, '042-528151', 'Jr. Alfonso Ugarte No. 247 (Morales)', 'http://tarapotoventas.tk/descargas/hoteles/morales%20beach.JPG', '-6.478555595500344', '-76.38247847557068')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(45, 'Riosol Tarapoto Hotel', 'S/.60 - S/.80', 'Hotel', 105, 140, 170, null, null, null, '042-523154', 'Jr. Jimenez Pimentel 407', 'http://tarapotoventas.tk/descargas/hoteles/riosol.JPG', '-6.490420395831541', '-76.36221170425415')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(46, 'Cerro Verde Tarapoto Hotel', 'S/.35 - S/50', 'Hotel', 70, 90, 120, null, null, null, '042-522288', 'Jr. Augusto B. Leguia 596', 'http://tarapotoventas.tk/descargas/hoteles/cerro_verde.JPG', '-6.485196933240838', '-76.36417508125305')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(47, 'Hotel Luna Azul', 'S/.35 - S/.50', 'Hotel', 75, 110, 140, null, null, null, '042-525787', 'Jr. Manco Capac No. 276', 'http://tarapotoventas.tk/descargas/hoteles/luna_azul.JPG', '-6.486765310222663', '-76.35666489601135')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(48, 'Hostal Casa Blanca', 'S/.25 - S/.35', 'Hostal', 40, 60, 90, null, null, null, '042-532380', 'Jr. Alegria Arias de Morey No. 399', 'http://tarapotoventas.tk/descargas/hoteles/casa_blaca.JPG', '-6.485932485330303', '-76.35999083518982')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(49, 'Hotel Cielo', 'S/.35 - S/.50', 'Hotel', 55, 86, 120, null, null, null, '042-521012', 'Jr. San Martin No. 334', 'http://tarapotoventas.tk/descargas/hoteles/cielo.JPG', '-6.48611370814404', '-76.36227607727051')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(50, 'Hostal Sol de Selva', 'S/.35 - S/.50', 'Hostal', 50, 80, 100, null, null, null, '042-524817', 'Jr. Pedro de Urz�a No. 161', 'http://tarapotoventas.tk/descargas/hoteles/sol%20de%20selva.JPG', '-6.491008031983588', '-76.35960459709167')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(51, 'Hotel Rio Cumbaza', 'S/.50 - S/.60', 'Hotel', 90, 55, null, null, null, null, '042-521473', 'Jr. Pedro de Urz�a No. 515', 'http://tarapotoventas.tk/descargas/hoteles/rio_cumbaza.JPG', '-6.488598852654505', '-76.36199712753296')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(52, 'Hotel Cumbaza', 'S/.50 - S/.60', 'Hotel', 80, 120, 150, null, null, null, '042-525152', 'Jr. Jimenez Pimentel 610', 'http://tarapotoventas.tk/descargas/hoteles/cumbaza.JPG', '-6.491401121543799', '-76.36330604553223')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(53, 'Hotel Tarapoto Inn', 'S/.25 - S/.35', 'Hotel', 50, 65, 110, null, 130, null, '042-524213', 'Jr. Jimenez Pimentel No. 115', 'http://tarapotoventas.tk/descargas/hoteles/tarapoto%20inn.JPG', '-6.488757421780964', '-76.36006593704224')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(54, 'Hotel Nilas', 'S/.50 - S/60', 'Hotel', 80, 120, 160, null, 200, null, '042-527331', 'Jr. Moyobamba 173', 'http://tarapotoventas.tk/descargas/hoteles/nilas.JPG', '-6.488023206330544', '-76.35886430740356')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(55, 'Hostal Marbella', 'S/.15 - S/.25', 'Hostal', 40, 60, null, null, null, 120, '042-531828', 'Jr. Augusto B. Leguia 509', 'http://tarapotoventas.tk/descargas/hoteles/marbella2.JPG', '-6.485559379332124', '-76.36419653892517')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(56, 'Pacifico Tarapoto Hotel', 'S/.25 - S/.35', 'Hotel', null, 30, 30, null, null, null, '042-525595', 'Jr. Gregorio Delgado No. 158', 'http://tarapotoventas.tk/descargas/hoteles/pacifico.JPG', '-6.488844035148297', '-76.36099934577942')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(57, 'Hostal Victor Manuel', 'S/.25 - S/.35', 'Hostal', 35, 55, 75, null, null, null, '042-529945', 'Jr. Ramon Castilla No. 266', 'http://tarapotoventas.tk/descargas/hoteles/victor%20manuel.JPG', '-6.487857308135932', '-76.3623833656311')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(58, 'Tarapoto Hotel and Suites', 'S/.35 - S/.50', 'Hotel', 60, 90, 120, null, null, null, '042-528080', 'Jr. Jimenez Pimentel No. 1215', 'http://tarapotoventas.tk/descargas/hoteles/tarapoto%20hotel%20suites.JPG', '-6.4963793410777075', '-76.36806964874268')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(59, 'Hotel Boca Raton', 'S/.50 - S/.60', 'Hotel', 80, 130, 160, 120, 200, null, '042-531226', 'Jr. Miguel Grau No. 151', 'http://tarapotoventas.tk/descargas/hoteles/boca_raton.JPG', '-6.48696652051022', '-76.36032342910767')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(60, 'Hotel San Antonio', 'S/.15 - S/.25', 'Hotel', 35, 45, null, 50, null, null, '042-522226', 'Jr. Jimenez Pimentel 126', 'http://tarapotoventas.tk/descargas/hoteles/san_antonio.JPG', '-6.488853362740809', '-76.36015176773071')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(61, 'Hotel Monte Azul', 'S/.35 - S/.50', 'Hotel', 50, 80, 120, null, null, null, '042-522443', 'Jr. Camila Morey No. 156', 'http://tarapotoventas.tk/descargas/hoteles/monte_azul.JPG', '-6.485506078452688', '-76.3619327545166')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(62, 'Hotel Firenze', 'S/.25 - S/.35', 'Hotel', 50, 60, 80, null, null, null, '042-525645', 'Jr. Aviaci�n No. 166', 'http://2.bp.blogspot.com/-1Hb7Tna5Fv0/UKf-Qa7EswI/AAAAAAAANnE/iWm3gwiJD_0/s1600/Sin_imagen.jpg', '-6.481957559727581', '-76.37845516204834')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(63, 'Hostal Santa Rosa', 'S/.35 - S/.50', 'Hostal', 40, 70, null, null, null, null, '042-521065', 'Av. Peru No. 365', 'http://tarapotoventas.tk/descargas/hoteles/santa%20rosa.JPG', '-6.477875999427299', '-76.38671636581421')");
db.execSQL("INSERT INTO "+N_TABLA+ " VALUES(64, 'Hostal La Posada Inn', 'S/.50 - S/.60', 'Hostal', 60, 120, 180, null, null, null, '042-522234', 'Jr. San Martin 146', 'http://tarapotoventas.tk/descargas/hoteles/la_posada_inn.JPG', '-6.487286324775443', '-76.36084377765656')");
			
			
//insertamos a la tabla edecanes
db.execSQL("INSERT INTO " + N_TABLA_E + " VALUES(1, 'Natal� Huam�n Macedo', 'Universidad Federico Villarreal', '941852368', 'Costa', 'fb.com/nataly.macedo.7')");
db.execSQL("INSERT INTO " + N_TABLA_E + " VALUES(2, 'Pierr Pinedo Flores', 'Universidad Cat�lica Santo Toribio de Mogrovejo', '966575429', 'Costa', 'fb.com/pierrpf')");
db.execSQL("INSERT INTO " + N_TABLA_E + " VALUES(3, 'Luis Mois�s Hidalgo Macedo', 'Universidad Nacional Tecnol�gica del Cono Sur de Lima', '942056631', 'Costa', 'fb.com/LuchiHm')");
db.execSQL("INSERT INTO " + N_TABLA_E + " VALUES(4, 'Joans Shupingahua Sangama', 'Universidad Nacional San Luis Gonzaga de Ica', '961039328',  'Costa', 'https://www.facebook.com/L3nno')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(5, 'Jharold Alexander Valles Celis', 'Universidad Nacional de Trujillo', '962865903', 'Costa', 'https://www.facebook.com/jhalex.valles')");
db.execSQL("INSERT INTO " + N_TABLA_E + " VALUES(6, 'Luis Andr� P�rez Tangoa', 'Universidad Nacional Pedro Ruiz Gallo', '943150578', 'Costa', 'fb.com/luisandre.pereztangoa')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(7, 'Heidy Bartra D�vila', 'Universidad Nacional de Piura', '942612330', 'Costa', 'fb.com/heidybartra.d')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(8, 'Roel Angulo Torres', 'Universidad C�sar Vallejo - Trujillo', '948446820', 'Costa', 'fb.com/nino.angulotorres')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(9, 'Edson Arantes Rengifo Tuesta', 'Universidad Privada Telesup', '942867362', 'Costa', 'fb.com/edsonarantes.rengifotuesta')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(10, 'Tatiana D�az C�rdenas', 'Universidad Nacional Mayor de San Marcos', '942473620', 'Costa', 'fb.com/tatiana.diazcardenas')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(11, 'Sandino Hidalgo Tuanama', 'Universidad Nacional de Trujillo - Sede Valle Jequetepeque', '979693482', 'Costa', 'fb.com/sanhty')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(12, 'Alexis Saavedra', 'Universidad Inca Garcilaso de la Vega', '985233911', 'Costa', 'fb.com/alexsp321')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(13, 'Freddy Huber Soplopuco Torres', 'Universidad Norbert Wiener', '950409798', 'Costa', 'fb.com/huberth.st')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(14, 'Jino Luis Alva Cueva', 'Universidad Jos� Carlos Mari�tegui', '947615217', 'Costa', 'fb.com/jinoluis.alvacueva')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(15, 'Ver�nica Pezo Pezo', 'Universidad ESAN', '965004081', 'Costa', 'fb.com/veriveri.pezo')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(16, 'Jeamith Mishel Torres Tello', 'Universidad Nacional de Ingenier�a', '961602097', 'Costa', 'fb.com/Jeamith')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(17, 'Rosa Elena Soplopuco Torres', 'Universidad Nacional Jorge Basadre Grohmann', '942461669', 'Costa', 'fb.com/rosieleni.soplopucotorres')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(18, 'Hans Ramirez Cordova', 'Universidad Nacional de Moquegua', '945670167', 'Costa', 'fb.com/hans.ramirezcordova')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(19, 'Catherine L�pez Archenti', 'Universidad de Lambayeque', '995279393', 'Costa', 'fb.com/catherine.lopezarchenti')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(20, 'Diego Amasifuen Torres', 'Universidad Nacional Daniel Alcides Carri�n -  Cerro de Pasco', '962947525', 'Sierra', 'fb.com/diego.amasifuentorres')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(21, 'Rocky Fern�ndez D�vila', 'Universidad Nacional Micaela Bastidas de Apurímac', '990274830', 'Sierra', 'fb.com/rj.fernandezdavila')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(22, 'Christian Zegarra Alvarado', 'Universidad Nacional Agraria de la Selva', '978001729', 'Selva', 'fb.com/chriszega')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(23, 'Rolando V�squez Ar�valo', 'Universidad Nacional del Altiplano', '966702096', 'Sierra', 'fb.com/wCkBzteR')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(24, 'Carolina Mendoza Amasifuen', 'Universidad Nacional del Santa', '978105961', 'Sierra', 'fb.com/Kharitu')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(25, 'Franko Ra�l Salazar Novoa', 'Universidad Peruana Los Andes', '990200645', 'Sierra', 'fb.com/franko.salazarnovoa')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(26, 'Joaqu�n del �guila Tenazoa', 'Universidad de Hu�nuco', '966157940', 'Sierra', 'fb.com/joaquindat')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(27, 'Diego Alan Fern�ndez Seijas', 'Universidad San Pedro', '949635385', 'Sierra', 'fb.com/diego.fernandezseijas')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(28, 'Cesar Augusto ACosta Garcia', 'Universidad Nacional Santiago Ant�nez de Mayolo', '976281539', 'Sierra', 'fb.com/cesaraugusto.acostagarcia.5')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(29, 'J�se C�rdenas Santill�n', 'Universidad Nacional de Cajamarca', '942402525', 'Sierra', 'fb.com/jacs91')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(30, 'Carlos Gonzales Delgado', 'Universidad Nacional del Centro del Per�', '998412996', 'Sierra', 'fb.com/carlos.h.gonzales.77')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(31, 'Katterine Cecilia Tejada Tavera', 'Universidad Nacional San Agust�n de Arequipa', '950996380', 'Sierra', 'fb.com/katceci')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(32, 'Carlos Roldan Acu�a', 'Universidad Nacional de la Amazon�a Peruana', '972886145', 'Selva', 'fb.com/carlos.roldanacuna')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(33, 'H�ctor Rojas R�os', 'Universidad Cient�fica del Per�', '953648378', 'Selva', 'fb.com/hector.rojasrios.5')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(34, 'Linder Alexander', 'Instituto Superior Tecnol�gico Alto Huallaga-Tocache', '966048212', 'Selva', 'fb.com/labr10')");
db.execSQL("INSERT INTO " + N_TABLA_E +" VALUES(35, 'Boris Galves Zegarra', 'Universidad Nacional de Ucayali', '979913123', 'Selva', 'fb.com/BorisGalvezZ')");
			}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + N_TABLA);
			db.execSQL("DROP TABLE IF EXISTS " + N_TABLA_E);
			onCreate(db);
		}

	}

	public basedatos(Context c) {
		nContexto = c;
	}

	// metodo para abrir nuestra base de datos
	public basedatos abrir() throws Exception {
		nHelper = new BDHelper(nContexto);
		nBD = nHelper.getReadableDatabase();
		return this;
	}

	public void cerrar() {
		nHelper.close();
	}

	public String[] getCategorias() {
		String[] categoria = null;
		String sql = "SELECT DISTINCT " + ID_CATEGORIA + " FROM " + N_TABLA
				+ " ORDER BY " + ID_FILA;
		try {
			abrir();
			cursor = nBD.rawQuery(sql, null);
			if (cursor.moveToFirst()) {
				categoria = new String[cursor.getCount()];
				int count = 0;
				do {
					categoria[count] = cursor.getString(0);
					count = count + 1;
				} while (cursor.moveToNext());
			}
			cursor.close();
			cerrar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return categoria;
	}
	
	//retorna las regiones 
	public String[] getRegiones() {
		String[] regiones = null;
		String sql = "SELECT DISTINCT " + ID_REGION + " FROM " + N_TABLA_E
				+ " ORDER BY " + ID_EDECANES;
		try {
			abrir();
			cursor = nBD.rawQuery(sql, null);
			if (cursor.moveToFirst()) {
				regiones = new String[cursor.getCount()];
				int count = 0;
				do {
					regiones[count] = cursor.getString(0);
					count = count + 1;
				} while (cursor.moveToNext());
			}
			cursor.close();
			cerrar();
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(nContexto, "error", Toast.LENGTH_SHORT).show();
		}
		return regiones;
	}
	
	//retorna las universidades por region
	public List<universidades_model> getUniversidades(String region) {
		List<universidades_model> uni = new ArrayList<universidades_model>();
		String sql = "SELECT  \"_id\",\"universidad\" FROM \"" + N_TABLA_E + "\"  WHERE   region = \"" + region + "\" ";
		try {
			abrir();
			cursor = nBD.rawQuery(sql, null);
			if (cursor.moveToFirst()) {
				while (!cursor.isAfterLast()) {
					universidades_model universidades = cursorUniversidades(cursor);
				      uni.add(universidades);
				      cursor.moveToNext();
				    }
			}
			cursor.close();
			cerrar();
		} catch (Exception e) {
			Toast.makeText(nContexto, "Hubo un error al recuperar los datos", Toast.LENGTH_SHORT).show();
		}
		return uni;
	}
	// metodos para busqueda
	public List<hoteles_model> getEstadias(String categoria) {
		List<hoteles_model> estadias = new ArrayList<hoteles_model>();
		String sql = "SELECT  \"_id\",\"nombre\",\"rango\",\"categoria\" FROM \"" + N_TABLA + "\"  WHERE   categoria = \"" + categoria + "\" ";
		try {
			abrir();
			cursor = nBD.rawQuery(sql, null);
			if (cursor.moveToFirst()) {
				while (!cursor.isAfterLast()) {
				      hoteles_model hoteles = cursorEstadias(cursor);
				      estadias.add(hoteles);
				      cursor.moveToNext();
				    }
			}
			cursor.close();
			cerrar();
		} catch (Exception e) {
			Toast.makeText(nContexto, "Hubo un error al recuperar los datos", Toast.LENGTH_SHORT).show();
		}
		return estadias;
	}

	//retorna los datos del edecan de cada universidad
	public String[] getEdecan(long id) {
		String[] datos = null;
		String sql = "SELECT  * FROM " + N_TABLA_E + "  WHERE   _id =" + id ;
		try {
			abrir();
			cursor = nBD.rawQuery(sql, null);
			int inombre = cursor.getColumnIndex(ID_NOMBRE_E);
			int iuniversidad = cursor.getColumnIndex(ID_UNIVERSIDAD);
			int icelular = cursor.getColumnIndex(ID_CELULAR);
			int ifacebook = cursor.getColumnIndex(ID_FACEBOOK);
			
			if (cursor.moveToFirst()) {
				datos = new String[]{
						cursor.getString(inombre),//0
						cursor.getString(icelular),//1
						cursor.getString(ifacebook),//2
						cursor.getString(iuniversidad),//3
				};
			}
			cursor.close();
			cerrar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return datos;
	}
	
	//retorna datos de un hotel
	public String[] getDescripcion(long id) {
		String[] datos = null;
		String sql = "SELECT  * FROM " + N_TABLA + "  WHERE   _id =" + id ;
		try {
			abrir();
			cursor = nBD.rawQuery(sql, null);
			int inombre = cursor.getColumnIndex(ID_NOMBRE);
			int icosto_s = cursor.getColumnIndex(ID_COSTO_S);
			int icosto_d = cursor.getColumnIndex(ID_COSTO_D);
			int icosto_m = cursor.getColumnIndex(ID_COSTO_M);
			int icosto_t = cursor.getColumnIndex(ID_COSTO_T);
			int icosto_c = cursor.getColumnIndex(ID_COSTO_C);
			int icosto_cx = cursor.getColumnIndex(ID_COSTO_CX);
			int itelefono = cursor.getColumnIndex(ID_TELEFONO);
			int idireccion = cursor.getColumnIndex(ID_DIRECCION);
			int iimagen = cursor.getColumnIndex(ID_IMAGEN);
			int ilatitud = cursor.getColumnIndex(ID_LATITUD);
			int ilongitud = cursor.getColumnIndex(ID_LONGITUD);
			if (cursor.moveToFirst()) {
				datos = new String[]{
						cursor.getString(inombre),//0
						cursor.getString(icosto_s),//1
						cursor.getString(icosto_d),//2
						cursor.getString(icosto_m),//3
						cursor.getString(icosto_t),//4
						cursor.getString(icosto_c),//5
						cursor.getString(icosto_cx),//6
						cursor.getString(itelefono),//7
						cursor.getString(idireccion),//8
						cursor.getString(iimagen),//9
						cursor.getString(ilatitud),//10
						cursor.getString(ilongitud)//11
				};
			}
			cursor.close();
			cerrar();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return datos;
	}

	private hoteles_model cursorEstadias(Cursor cursor) {
	    hoteles_model estadias = new hoteles_model();
	    estadias.setId(cursor.getLong(0));
	    estadias.setNombre(cursor.getString(1));
	    estadias.setRango(cursor.getString(2));
	    estadias.setCategoria(cursor.getString(3));
	    return estadias;
	  }
	
	private universidades_model cursorUniversidades(Cursor cursor) {
		universidades_model estadias = new universidades_model();
	    estadias.setId(cursor.getLong(0));
	    estadias.setUniversidad(cursor.getString(1));
	    return estadias;
	  }
}
