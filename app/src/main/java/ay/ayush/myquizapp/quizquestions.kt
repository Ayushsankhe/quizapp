package ay.ayush.myquizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import org.w3c.dom.Text

class quizquestions : AppCompatActivity(),View.OnClickListener {
    private var optionone:TextView?=null
    private var answer:Boolean=true
    private var optiontwo:TextView?=null
    private var optionthree:TextView?=null
    private var optionfour:TextView?=null
    private var questionlist:ArrayList<Questions>?=null
    private final var currentposition:Int =1
    private var Image:ImageView?=null
    private var question:TextView?=null
    private var progressbar:ProgressBar?=null
    private var progressbartext:TextView?=null
    private var buttonsubmit:Button?=null

    private var intents:String?=null
    private var mselectedoption:Int=1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quizquestions)
        questionlist=Constants.getquestion()

        optionone=findViewById(R.id.optionone)
        optiontwo=findViewById(R.id.optiontwo)
        optionthree=findViewById(R.id.optionthree)
        optionfour=findViewById(R.id.optionfour)
        Image=findViewById(R.id.imagequestion)
        question=findViewById(R.id.tv_question)
        progressbar=findViewById(R.id.progressbar)
        progressbartext=findViewById(R.id.progressbartext)
        optionone?.setOnClickListener(this)
        optiontwo?.setOnClickListener(this)
        optionthree?.setOnClickListener(this)
        optionfour?.setOnClickListener(this)
        intents=intent.getStringExtra(Constants.questio)
        buttonsubmit=findViewById(R.id.buttonsubmit)
        buttonsubmit?.setOnClickListener{
            val list=questionlist!![mselectedoption-1]
            Log.i("tem","${list.answer}")
            Log.i("intent","$intents")
            if(list.answer!=currentposition){
                answer=false
            }

            if(!answer){
                when(currentposition){
                    1->optionone?.background=ContextCompat.getDrawable(this,R.drawable.wrongoptionbackground)
                    2->optionone?.background=ContextCompat.getDrawable(this,R.drawable.wrongoptionbackground)
                    3->optionone?.background=ContextCompat.getDrawable(this,R.drawable.wrongoptionbackground)
                    4->optionone?.background=ContextCompat.getDrawable(this,R.drawable.wrongoptionbackground)

                }}
            else{
                when(currentposition){
                    1->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)
                    2->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)
                    3->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)
                    4->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)

                }

            }
            when(currentposition){
                1->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)
                2->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)
                3->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)
                4->optionone?.background=ContextCompat.getDrawable(this,R.drawable.correctoptionborder)
            }
            if(mselectedoption>questionlist!!.size){
                buttonsubmit?.text="Finish"
            }
            else{
                buttonsubmit?.text="Next Question"
                mselectedoption++
                setQuestion()
            }

        }

        setQuestion()
    }
    private fun setQuestion(){

         var questions=questionlist!![mselectedoption-1]
        optionone?.text=questions.optionOne
        optiontwo?.text=questions.optionTwo
        optionthree?.text=questions.optionThree
        optionfour?.text=questions.optionFour
        Image?.setImageResource(questions.image)
        question?.text=questions.Questions
        progressbar?.progress=currentposition
        progressbartext?.text="$currentposition/${progressbar?.max}"

    }
    private fun defaultoptionview(){
        var options=ArrayList<TextView>()
        optionone?.let {
            options.add(0,it)
        }
        optiontwo?.let {
            options.add(1,it)
        }
        optionthree?.let {
            options.add(2,it)
        }
        optionfour?.let {
            options.add(3,it)
        }
        for(option in options){
            option.setTextColor(Color.parseColor("#5D576B"))
            option.typeface= Typeface.DEFAULT
            option.background=ContextCompat.getDrawable(
                this,
                R.drawable.default_background
            )
        }

    }
    private fun checkinganswer(){

    }


    private fun selectedoptionview(tv:TextView,selectedoption:Int){
        currentposition=selectedoption
        Log.i("question","$currentposition")
        tv.setTextColor(Color.parseColor("#0C120C"))
        tv.setTypeface(tv.typeface,Typeface.BOLD)
        tv.background=ContextCompat.getDrawable(this,
        R.drawable.selectedbackground)

    }


    override fun onClick(v: View?) {
        defaultoptionview()
        when(v?.id){
            R.id.optionone->{
                optionone?.let {
                    selectedoptionview(it,1)
                }
            }
            R.id.optiontwo->{
                optiontwo?.let {
                    selectedoptionview(it,2)
                }
            }
            R.id.optionthree->{
                optionthree?.let {
                    selectedoptionview(it,3)
                }
            }
            R.id.optionfour->{
                optionfour?.let {
                    selectedoptionview(it,4)
                }
            }

        }

    }
}

