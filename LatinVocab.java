public class LatinVocab
{
	public static void main (String[] args)
	{
		String [][] card = {{"a (ab)", "+ abl: from, by"},
		                    {"ac (atque)", "and"},
		                    {"ad", "+ acc: to, towards, at, near"},
		                    {"aequor, aequoris", "nueter: expanse, sea"},
		                    {"agmen, agminis", "nueter: stream, multitude, line, army, team"},
		                    {"alius, -a, -ud", "another, other"},
		                    {"altus, -a, -um", "tall,high, deep"},
		                    {"amor, amoris", "masculine: love"},
		                    {"animus, -i", "masculine: mind"},
		                    {"ante", "+ acc: before, in front of"},
		                    {"ara, -ae","feminine: altar"},
		                    {"arma, -orum","neuter plural: weapons"},
		                    {"arx, arcis","feminine: citadel"},
		                    {"at (ast)","but, nevertheless"},
		                    {"aura, -ae","feminine: air, wind, atmosphere"},
		                    {"aut","or"},
		                    {"bellum, -i","neuter: war"},
		                    {"caelum, -i","neuter: sky, heaven"},
		                    {"circum","+ acc: around; adverb: around"},
		                    {"coniunx, coniugis","masculine/feminine: spouse"},
		                    {"corpus, corporis","neuter: body"},
		                    {"cum","+ abl: with; conjunction: when, since, whenever, although"},
		                    {"cura, -ae","feminine: care, anxiety"},
		                    {"de","+ abl: down from, from, about"},
		                    {"deus, dei","masculine: god"},
		                    {"dico, dicere, dixi, dictus","to say"},
		                    {"dictum, -i","neuter: utterance, word"},
		                    {"divus, -i","masculine: god"},
		                    {"do, dare, dedi, datus","to give"},
		                    {"domus, -us or -i","feminine: house"},
		                    {"duco, ducere, duxi, ductus","to lead, take"},
		                    {"dum","while, until"},
		                    {"e (ex)","+ abl: from, out of"},
		                    {"ego (pl. nos)","I (pl. we)"},
		                    {"eo, ire, ii (or ivi), iturus","(irregular) to go"},
		                    {"et","and, also"},
		                    {"fama, -ae","feminine: fame, story"},
		                    {"fatum, -i","neuter: fate, death"},
		                    {"fero, ferre, tuli, latus","(irregular) to carry, bring, say"},
		                    {"ferrum, -i","neuter: iron, sword"},
		                    {"flamma, -ae","feminine: flame"},
		                    {"for, fari, fatus sum","to speak (prophetically)"},
		                    {"gens, gentis","feminine: family, clan"},
		                    {"hic","adverb: here; ...heac, hoc: this"},
		                    {"hinc","from this, hence, next"},
		                    {"hostis, hostis","masculine/feminine: enemy"},
		                    {"iam","now, already, soon"},
		                    {"ignis, ignis","masculine: fire"},
		                    {"ille, -a, -ud","he, she, it"},
		                    {"in","+ abl: in, on, among; + acc: into, against, towards"},
		                    {"ingens, ingentis","big"},
		                    {"inter","+ acc: between, among"},
		                    {"ipse, -a, -um","himself, herself, itself, very"},
		                    {"labor, laboris","masculine: work, suffering"},
		                    {"limen, liminis","neuter: threshold"},
		                    {"litus, litoris","neuter: seashore"},
		                    {"locus, -i","masculine: place"},
		                    {"magnus, -a, -um","big, loud"},
		                    {"manus, manus","feminine: hand, band (of men)"},
		                    {"medius, -a, -um","mid-, middle of"},
		                    {"mens, mentis","feminine: mind, heart, purpose, attitude, will"},
		                    {"meus, -a, -um","my, mine"},
		                    {"miser, -a, -um","unhappy"},
		                    {"moenia, moenium","neuter plural: walls"},
		                    {"mors, mortis","feminine: death"},
		                    {"multus, -a, -um","much, many"},
		                    {"natus, -i","masculine: son"},
		                    {"nec (neque)","and... not"},
		                    {"non","not"},
		                    {"noster, -tra, -trum","our"},
		                    {"nox, noctis","feminine: night"},
		                    {"numen, numinis","neuter: divine power, divinity"},
		                    {"nunc","now"},
		                    {"o","oh"},
		                    {"oculus, -i","masculine: eye"},
		                    {"omnis, -is, -e","all, each"},
		                    {"os, oris","neuter: mouth, face, expression"},
		                    {"pater, patris","masculine: father"},
		                    {"pectus, pectoris","neuter: chest"},
		                    {"per","+ acc: through, along, over"},
		                    {"peto, petere, petivi, petitus","to seek"},
		                    {"possum, posse, potui","(irregular) to be able"},
		                    {"primus, -a, -um","first"},
		                    {"-que","and"},
		                    {"qui, quae, quod","who, that"},
		                    {"quis","who"},
		                    {"regnum, -i","neuter: kingdom"},
		                    {"res, rei","feminine: thing, affair"},
		                    {"rex, regis","masculine: king"},
		                    {"sanguis, sanguinis","masculine: blood, family"},
		                    {"se","himself"},
		                    {"sed","but"},
		                    {"sedes, sedis","feminine: seat, home"},
		                    {"sequor, sequi, sectus sum","to follow"},
		                    {"si","if"},
		                    {"sic","thus, in this way"},
		                    {"socius, -i","masculine: companion, ally"},
		                    {"sto, stare, steti, staturus","to stand"},
		                    {"sub","+ abl: under, down in, up to"},
		                    {"sum, esse, fui, futurus","(irregular) to be"},
		                    {"summus, -a, -um","greatest, highest, supreme"},
		                    {"talis, -is, -e","such, of this kind"},
		                    {"tantus, -a, -um","so great, such a big"},
		                    {"tectum, -i","neuter: roof, house, shelter"},
		                    {"telum, -i","neuter: weapon, spear"},
		                    {"teneo, tenere, tenui, tentus","to hold"},
		                    {"terra, -ae","feminine: ground"},
		                    {"totus, -a, -um","all, the whole"},
		                    {"tu (pl. vos)","you"},
		                    {"tum","then"},
		                    {"tuus, -a, -um","your (sing.)"},
		                    {"ubi","where, when"},
		                    {"umbra, -ae","feminine: shadow"},
		                    {"unus, -a, -um","one, only, alone"},
		                    {"urbs, urbis","feminine: city"},
		                    {"ut (uti)","+ indicitive: as, when; + subjunctive: so that, how"},
		                    {"-ve","or"},
		                    {"venio, venire, veni, venturus","to come"},
		                    {"ventus, -i","masculine: wind"},
		                    {"via, -ae","feminine: road"},
		                    {"video, videre, vidi, visus","to see"},
		                    {"vinco, vincere, vici, victus","to win, conquer"},
		                    {"vir, viri","masculine: man"},
		                    {"vis, vis","feminine: force, amount"},
		                    {"voco, vocare, vocavi, vocantus","to call"},
		                    {"vox, vocis","feminine: voice, utterance, word"}};

		FlashCards latin = new FlashCards (card);
		latin.learn ();
	}
}