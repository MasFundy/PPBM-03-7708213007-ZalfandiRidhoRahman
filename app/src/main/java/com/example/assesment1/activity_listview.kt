package com.example.assesment1

import AdapterCustom
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast

class activity_listview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_listview)

        // siapin variable array yang mempunyai nilai
        var namanama = arrayOf<String>(
            "Oppenheimer",
            "Barbie",
            "Tainted Souls",
            "Se7en",
            "Insidious",
            "Star Wars Episode IV",
            "Spirited Away",
            "Spider-Man",
            "Shang-Chi",
            "Dunkirk",
            "The Dark Knight")

        var fotofoto = arrayOf<Int>(
            R.drawable.oppnhmr,
            R.drawable.brb,
            R.drawable.kpm,
            R.drawable.sejen,
            R.drawable.insidious,
            R.drawable.sw4,
            R.drawable.sprtdawy,
            R.drawable.spdrmn,
            R.drawable.shngch,
            R.drawable.dnkrk,
            R.drawable.tdk
        )

        val descript = arrayOf<String>(
            "Explores the life of J. Robert Oppenheimer, the brilliant scientist central to the development of the atomic bomb. The film delves into the moral quandaries and far-reaching consequences stemming from his groundbreaking work.",
            "Unfolds a whimsical adventure where the iconic doll comes to life, discovering the true essence of friendship and self-acceptance.",
            "Takes us to a mysterious small town, unraveling dark secrets that interconnect the lives of its residents",
            "Detectives pursue a sadistic serial killer, navigating a world filled with moral ambiguity and shocking revelations",
            "Ventures into the supernatural realm as a family grapples with malevolent spirits haunting their home",
            "Immerses audiences in an epic space opera where rebels battle against the tyrannical Galactic Empire.",
            "A magical journey through a fantastical world, where a young girl confronts spirits and mystical creatures.",
            "Swings into action as the beloved superhero faces formidable villains while balancing the challenges of a dual life.",
            "Follows a skilled martial artist confronting his past and battling powerful forces threatening the world.",
            "Provides a gripping portrayal of the evacuation of Allied soldiers from the beaches during World War II.",
            "Delves into the complex psyche of Batman as he faces the Joker, a chaotic criminal mastermind, in a battle for Gotham City's soul.")

        var deskripsiFilm = arrayOf<String>(
            "**Oppenheimer:**\n\n\"Oppenheimer,\" Christopher Nolan's exploration of J. Robert Oppenheimer's life, released in 2022, delves into the complex moral landscape of scientific innovation during wartime. Michael Fassbender leads the cast with a nuanced portrayal of Oppenheimer, capturing the internal conflicts faced by the scientist as he grapples with the creation of the atomic bomb. Nolan's direction, characterized by intricate storytelling and visual brilliance, brings forth Oppenheimer's ethical dilemmas, weaving a narrative that transcends the historical events it portrays. The film not only serves as a biographical study but also prompts viewers to contemplate the far-reaching consequences of scientific advancements on humanity.\n",

            "**Barbie:**\n\nGreta Gerwig's imaginative take on the iconic doll comes to life in \"Barbie,\" released in 2023. With Emma Stone in the lead role, the film offers a delightful adventure that goes beyond the typical confines of a children's movie. Gerwig's directorial flair infuses the narrative with charm and depth, providing a nuanced exploration of friendship, self-acceptance, and the importance of embracing individuality. Stone's charismatic performance brings a relatable quality to Barbie, transforming the character into more than just a plastic icon. \"Barbie\" emerges not only as a visually enchanting experience but also as a heartwarming tale with universal themes.\n",

            "**Tainted Souls:**\n\nDirected by David Fincher and released in 2021, \"Tainted Souls\" captivates audiences with its intense mystery set within the seemingly tranquil confines of a small town. The film boasts a stellar ensemble cast, including Rooney Mara, Jake Gyllenhaal, and Viola Davis, each delivering powerful performances that elevate the narrative. Fincher's signature atmospheric tension and meticulous storytelling unravel the interconnected lives of the characters, exposing dark secrets and moral complexities. \"Tainted Souls\" emerges as a gripping exploration of the human psyche, as Fincher skillfully navigates the thin line between guilt and redemption in this small-town mystery.\n",

            "**Se7en:**\n\nDavid Fincher's psychological thriller, \"Se7en,\" released in 1995, remains a benchmark in the crime genre. Starring Brad Pitt and Morgan Freeman, the film weaves a chilling narrative around the pursuit of a sadistic serial killer who uses the seven deadly sins as a macabre motif. Fincher's direction creates an immersive experience, accentuated by the film's dark and intense atmosphere. Pitt and Freeman deliver memorable performances, capturing the nuances of their characters and the moral dilemmas they face. \"Se7en\" transcends the conventions of a typical crime thriller, offering a haunting exploration of the consequences of unchecked human behavior and the fragility of morality in the face of darkness.\n",

            "**Insidious:**\n\nJames Wan's directorial prowess takes center stage in \"Insidious,\" a supernatural horror film released in 2010. The film follows a family, portrayed by Patrick Wilson and Rose Byrne, as they confront malevolent spirits haunting their home. Wan skillfully blends horror and psychological tension, creating an atmosphere of unease that permeates the narrative. \"Insidious\" explores the fragility of the human psyche, offering spine-tingling scares and unexpected twists that redefine the haunted house genre. The film's success lies not only in Wan's directorial finesse but also in the strong performances that elevate it to a standout in the horror genre.\n",

            "**Star Wars Episode IV:**\n\nGeorge Lucas's groundbreaking space opera, \"Star Wars Episode IV: A New Hope,\" released in 1977, remains an enduring cultural phenomenon. The film introduces audiences to a galaxy far, far away, where rebels led by Mark Hamill, Carrie Fisher, and Harrison Ford battle against the oppressive Galactic Empire. Lucas's visionary direction revolutionized the science fiction genre, creating an epic tale that transcends generations. With its iconic characters, epic space battles, and timeless themes of heroism and hope, \"A New Hope\" stands as a cornerstone in cinematic history.\n",

            "**Spirited Away:**\n\nHayao Miyazaki's animated masterpiece, \"Spirited Away,\" released in 2001, takes viewers on a magical journey through a fantastical world. The film follows Chihiro, voiced by Rumi Hiiragi, as she encounters spirits, witches, and otherworldly creatures. Miyazaki's unique storytelling and animation style create an enchanting narrative that explores themes of courage, resilience, and the transformative power of inner strength. \"Spirited Away\" not only captivates with its visually stunning landscapes but also resonates as a timeless tale that appeals to audiences of all ages.\n",

            "**Spider-Man:**\n\nSam Raimi's 2002 adaptation of \"Spider-Man\" swings into action with Tobey Maguire donning the iconic red-and-blue suit. The film offers more than just thrilling web-slinging sequences, as Raimi explores the coming-of-age journey of Peter Parker. Maguire's portrayal captures the essence of the character, navigating high school struggles, personal growth, and the responsibility that comes with newfound powers. \"Spider-Man\" not only revitalized the superhero genre but also set a precedent for character-driven storytelling within the realm of comic book adaptations.\n",

            "**Shang-Chi:**\n\n\"Shang-Chi and the Legend of the Ten Rings,\" directed by Destin Daniel Cretton and released in 2021, marks a fresh chapter in the Marvel Cinematic Universe. Simu Liu leads the cast as Shang-Chi, a skilled martial artist confronting his mysterious past and battling ancient forces. Cretton's direction, coupled with Liu's charismatic performance, delivers a visually dazzling and narratively compelling superhero film. \"Shang-Chi\" not only breaks new ground in representation within the genre but also seamlessly blends martial arts prowess with the spectacle expected from the Marvel franchise.\n",

            "**Dunkirk:**\n\nChristopher Nolan's war epic, \"Dunkirk,\" released in 2017, offers a visceral and immersive portrayal of the evacuation of Allied soldiers from the beaches during World War II. The film features an ensemble cast, including Fionn Whitehead, Tom Hardy, and Harry Styles. Nolan's innovative storytelling intertwines three perspectives – land, sea, and air – creating a cinematic experience that captures the chaos, bravery, and desperation of war. \"Dunkirk\" stands as a testament to Nolan's directorial prowess and the human spirit's resilience in the face of adversity.\n",

            "**The Dark Knight:**\n\nChristopher Nolan's \"The Dark Knight,\" released in 2008, transcends the superhero genre with its dark and complex narrative. Christian Bale reprises his role as Batman, with Heath Ledger delivering an iconic performance as the Joker. Nolan's direction and the ensemble cast, including Aaron Eckhart and Gary Oldman, elevate the film beyond typical superhero fare. \"The Dark Knight\" becomes a psychological thriller questioning societal constructs and the thin line between order and chaos. The film stands as a cinematic triumph, impacting not only the superhero genre but also the landscape of blockbuster filmmaking.\n"
        )




        // definisi list view
        val _list = findViewById<ListView>(R.id.ListFilms)
        _list.adapter = AdapterCustom(this, namanama,fotofoto, descript)
        _list.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(this, DetailActivity::class.java)

            // Menyertakan data ekstra ke Intent
            intent.putExtra("nama", namanama[position])
            intent.putExtra("desc", deskripsiFilm[position])
            intent.putExtra("foto", fotofoto[position])

            // Memulai aktivitas dengan Intent yang dikonfigurasi
            startActivity(intent)
        }

        val imageBack = findViewById<ImageView>(R.id.back)
        imageBack.setOnClickListener {
            val intpindah =
                Intent(this, MainActivity::class.java)
            startActivity(intpindah)
        }
    }
}